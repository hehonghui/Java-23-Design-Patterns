package FlyweightPattern;

/**
 * 数据库连接简单模拟
 * @author Mr-Simple
 *
 */
public class MyConnection implements Cloneable{
	private String m_DBName;
	private String m_UserName;
	private String m_Pwd;
	
	public MyConnection(String db, String name, String pwd){
		// 设置已连接的对象的相关信息
		this.setConnectionInfo(db, name, pwd) ;
	}
	
	/**
	 * 设置已连接的对象的相关信息
	 * @param db		数据库名称
	 * @param name		用户名
	 * @param pwd		密码
	 */
	public void setConnectionInfo(String db, String name, String pwd){
		m_DBName = db;
		m_UserName = name;
		m_Pwd = pwd;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getDBName(){
		return m_DBName;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getUserName(){
		return m_UserName;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getPwd(){
		return m_Pwd;
	}

	/**
	 * 原型模式的clone方法
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		MyConnection conn = (MyConnection)super.clone();
		return conn;
	}
	
	
}
