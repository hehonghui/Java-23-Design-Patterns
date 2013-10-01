package DecoratorPattern;

/**
 * 装饰模式
 * 
 * 备注 ：
 * 	装饰模式就是给一个对象增加一些新的功能，而且是动态的，要求装饰对象和被装饰对象实现
 * 	同一个接口，装饰对象持有被装饰对象的实例。
 * 
 * 装饰器模式的应用场景：
		1、需要扩展一个类的功能。
		2、动态的为一个对象增加功能，而且还能动态撤销。
		（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
		
 * @author Mr-Simple
 *
 */
public class ComputerDecorator implements CommonInterface {

	private Coder m_Coder;
	
	/**
	 * 构造函数,传递要被装饰的参数
	 * @param coder
	 */
	public ComputerDecorator(Coder coder){
		m_Coder = coder ;
	}
	
	/**
	 * 通过该方法进行装饰
	 */
	@Override
	public void useComputer() {
		// 先装饰一下
		this.decrate() ;
		// 再调用实际的操作
		m_Coder.useComputer() ;
	}
	
	/**
	 * 用于装饰的一些基本函数
	 */
	private void decrate(){
		println( "使用电脑的前提要先开个机..." );
		println( "启动windows 8..." );
		println( "进入电脑桌面..." );
		println( "打开了VS2012..." );
	}
	
	/**
	 * 
	 * @param msg
	 */
	private void println(String  msg){
		System.out.println( msg );
	}

}
