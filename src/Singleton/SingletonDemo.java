package Singleton;


/**
 * 单例模式
 * @author Mr-Simple
 *
 */
public class SingletonDemo {
	// 私有的静态对象
	private static SingletonDemo m_Instance = new SingletonDemo();
	
	/**
	 * 私有的构造函数
	 */
	private SingletonDemo(){
		
	}
	
	/**
	 * 静态方法,获取单例对象
	 * @return
	 */
	public static SingletonDemo getInstance(){
		if( m_Instance == null ){
				m_Instance = new SingletonDemo();
		}
		return m_Instance;
	}
	
	/**
	 * XX操作
	 */
	public void sayHello(){
		System.out.println("Hello sexy lady...");
	}
	
	/**
	 * main方法
	 * @param args
	 */
	public static void main(String args[]){
		// 实例化对象
		SingletonDemo instance = SingletonDemo.getInstance();
		instance.sayHello();
	}
}
