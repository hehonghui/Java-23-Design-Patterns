package BridgePattern;

/**
 * 	桥接模式
 * 
 * 备注 ： 
 * 		桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。
 * 桥接的用意是：将抽象化与实现化解耦，使得二者可以独立变化，
 * 像我们常用的JDBC桥DriverManager一样，JDBC进行连接数据库的时候，
 * 在各个数据库之间进行切换，基本不需要动太多的代码，只需要更改数据库驱动。
 * 原因就是JDBC提供统一接口，每个数据库提供各自的实现，用一个叫做数据库驱动的程序来桥接就行了。
 * 
 * @author Mr-Simple
 *
 */

public class DriverBridge {
	private DBDriver m_Driver;
	
	/**
	 * 构造函数
	 */
	public DriverBridge(){
	
	}
	
	/**
	 * 构造函数,传递驱动类型
	 * @param d
	 */
	public DriverBridge(DBDriver d){
		m_Driver = d;
	}
	
	/**
	 * 设置数据库驱动
	 * @param driver
	 */
	public void setDriver(DBDriver driver){
		m_Driver = driver;
	}
	
	/**
	 * 获取驱动
	 * @return
	 */
	public DBDriver getDBDriver(){
		return m_Driver ;
	}
	
	/**
	 * 驱动数据库
	 */
	public void driverDatabase(){
		if( m_Driver != null ){
			m_Driver.driver();
		}else{
			System.out.println("sorry, 没有数据库驱动!");
		}
		
		System.out.println("数据库已经连接 !!!\n");
	}
	
}// end of class
