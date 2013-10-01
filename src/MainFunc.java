import StrategyPattern.ICalculate;
import StrategyPattern.PlusCalculate;
import ObserverPattern.*;



/**
 * 
 * @author Mr-Simple
 *
 */
public class MainFunc {

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]){
	/*	// 使用具体工厂类实例化工厂对象
		Factory factory = new VoiceSenderFactory();
		// 使用工厂方法实例化具体对象
		Sender sender = factory.createSender();
		sender.send();
		
		factory = new MailFactory();
		sender = factory.createSender();
		sender.send();
	
		
		// 装饰者模式
		Coder com = new Coder();
		ComputerDecorator comd = new ComputerDecorator( com ); 
		comd.useComputer() ;
			
		
		// 代理模式
		Netizen netz = new Netizen();
		// 代理上网
		NetworkProxy proxy = new NetworkProxy( netz );
		proxy.surfTheInternet(); 
		
		// 外观模式
		ComputerFacade comp = new ComputerFacade();
		// 电脑启动
		comp.startup();
		// 电脑关闭
		comp.shutdown();
	
		
		// mysql数据库驱动
		MysqlDriver mysql = new MysqlDriver();
		// 桥接对象,使用提供的数据库驱动来操作数据库
		DriverBridge bridge = new DriverBridge();
		bridge.setDriver( mysql ) ;
		bridge.driverDatabase() ;
	
		// 享元模式,使用单例模式获取连接池
		ConnectionPool pool = ConnectionPool.getConnectionInstance();
		MyConnection conn = pool.connectToDatabase("db10", "user10", "pwd10") ;
		MyConnection conn2 = pool.connectToDatabase("db100", "user100", "pwd100") ;
	
		// 策略模式
		ICalculate cal = new PlusCalculate();
		int result = cal.calculate("2+5") ;
		println("2+5=" + result);	*/
		
		// 观察者模式
		// 订阅者(观察者),老师和工人
		WorkerSubscriber worker = new WorkerSubscriber();
		TeacherSubscriber teacher = new TeacherSubscriber();
		// 被订阅的主题
		HouseSubject subject = new HouseSubject();
		// 增加观察者
		subject.addObserver(worker) ;
		subject.addObserver(teacher) ;
		// 被订阅的主题发生变化,则所有的观察者都会受到通知
		subject.priceChange() ;
		
	}
	
	public static void println(String msg){
		System.out.println( msg );
	}
}
