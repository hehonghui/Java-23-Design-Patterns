package FlyweightPattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 享元模式
 * 
 * 备注 ： 
 * 		享元模式的主要目的是实现对象的共享，即共享池，当系统中对象多的时候可以减少内存的开销，
 * 	通常与工厂模式一起使用。
 * 
 * 		FlyWeightFactory负责创建和管理享元单元，当一个客户端请求时，工厂需要检查当前对象池中
 * 是否有符合条件的对象，如果有，就返回已经存在的对象;如果没有，则创建一个新对象.
 * 这样就在一定程度上节省了连接数据库的资源、内存、时间的消耗，减少了实例的数量。
 * 
 * @author Mr-Simple
 *
 */

public class ConnectionPool {
	// 真正存储着已连接的对象的连接池
	private ArrayList<MyConnection> m_ConnectedPools = new ArrayList<MyConnection>();
	// 连接池对象
	private static ConnectionPool m_Pool = new ConnectionPool();
	
	
	/**
	 * 私有的构造函数,模拟20个已连接对象
	 */
	private ConnectionPool(){
		MyConnection conn = new MyConnection("db","user","pwd");
		for(int i=0; i<20; i++){
			try {
				// 使用原型模式拷贝对象
				MyConnection temp = (MyConnection)conn.clone();
				// 设置连接对象的信息
				temp.setConnectionInfo("db" + i, "user" + i, "pwd" + i) ;
				// 添加到连接池
				m_ConnectedPools.add( temp ) ;
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		} // end of for()
	}
	
	
	/**
	 * 获取实例对象
	 * @return
	 */
	public static ConnectionPool getConnectionInstance(){
		return m_Pool ;
	}
	
	
	/**
	 * 连接数据库,首先看连接池中是否有对应连接,如果有则直接取出;
	 * 否则必须进行数据库连接,并且返回该连接对象
	 * @param db		数据库名称
	 * @param name		用户名
	 * @param pwd		密码
	 * @return
	 */
	public MyConnection connectToDatabase(String db, String name, String pwd){
		// 迭代整个连接池,查找对应的连接对象
		Iterator<MyConnection> iter = m_ConnectedPools.iterator();
		while( iter.hasNext() ){
			// 获取已连接的对象
			MyConnection con = iter.next();
			// 如果连接池中已经包含该连接,则直接从连接池中取
			if( db.equals( con.getDBName() ) && name.equals( con.getUserName() )
					&& pwd.equals( con.getPwd() )){
				System.out.println("连接池中有,直接从连接池中取...");
				return con;
			}
		}
		
		// 连接池中没有,则进行数据库连接
		return realConnectToDatabase(db, name, pwd);
	}
	
	
	/**
	 * 连接数据库,返回已连接的对象
	 * @param db		数据库名称
	 * @param name		用户名
	 * @param pwd		密码
	 * @return
	 */
	private MyConnection realConnectToDatabase(String db, String name, String pwd){
		System.out.println("连接池中没有,执行连接数据库操作...");
		return new MyConnection(db, name, pwd);
	}
	
}
