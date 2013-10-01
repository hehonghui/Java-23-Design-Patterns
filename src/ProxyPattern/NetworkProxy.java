package ProxyPattern;

/**
 * 代理模式,与装饰模式有点类似
 * 
 * 代理模式的应用场景：
	如果已有的方法在使用的时候需要对原有的方法进行改进，此时有两种办法：
	1、修改原有的方法来适应。这样违反了“对扩展开放，对修改关闭”的原则。
	2、就是采用一个代理类调用原有的方法，且对产生的结果进行控制。
	
	这种方法就是代理模式,使用代理模式，可以将功能划分的更加清晰，有助于后期维护！
	
 * @author Mr-Simple
 *
 */
public class NetworkProxy implements INetWork {

	private Netizen m_Netizen ;
	
	public NetworkProxy(Netizen netz){
		m_Netizen = netz ;
	}
	
	/**
	 * 网上冲浪操作,使用代理类的方法对原来的操作进行修改,
	 */
	@Override
	public void surfTheInternet() {
		// 代理类新增的操作
		useProxyIp();
		goToWebsite();
		loginToQQ();
		// 原本的操作
		m_Netizen.surfTheInternet();
	}
	
	/**
	 * 使用代理
	 */
	public void useProxyIp(){
		System.out.println("使用代理IP地址...");
	}

	/**
	 * 导航到www.google.com主页
	 */
	public void goToWebsite(){
		System.out.println("使用代理导航到www.google.com主页...");
	}
	
	/**
	 * 登录到QQ
	 */
	public void loginToQQ(){
		System.out.println("使用代理登录到QQ...");
	}
}
