package StatePattern;  
/** 
 * @Title: State.java 
 * @Package StatePattern 
 * @Description: TODO( 状态类 )
 * 核心思想就是：
 * 			当对象的状态改变时，同时改变其行为，很好理解！就拿QQ来说，有几种状态，在线、隐身、忙碌等，
 * 		每个状态对应不同的操作，而且你的好友也能看到你的状态，所以，状态模式就两点：
 * 		1、可以通过改变状态来获得不同的行为。
 * 		2、你的好友能同时看到你的变化。 
 * @author Mr.Simple bboyfeiyu@gmail.com 
 * @date Dec 18, 2012 4:23:35 PM 
 * @version V1.0 
 */
public class State {
	private String mState;
	public static final String ONLINE = "online";
	public static final String OFFLINE = "offline";
	
	/**
	 * 构造函数
	 * @param state
	 */
	public State(String state){
		setState(state) ;
	}
	
	/**
	 * 
	 * @Title: getState  
	 * @Description: TODO( 返回状态 )   
	 * @return String    
	 * @throws
	 */
	public String getState() {
		return mState;
	}
	
	/**
	 * 
	 * @Title: setState 
	 * @Description: TODO( 设置状态 ) 
	 * @param newState   新的状态
	 * @return void    
	 * @throws
	 */
	public void  setState(String newState) {
		this.mState = newState;
	}
	
	/**
	 * 
	 * @Title: onLineAction 
	 * @Description:      
	 * @return void    
	 * @throws
	 */
	public void  onLineAction() {
		System.out.println("在线的时候调用的方法") ;
	}
	
	/**
	 * 
	 * @Title: offLineAction 
	 * @Description: TODO()     
	 * @return void    
	 * @throws
	 */
	public void offLineAction(){
		System.out.println("离线的时候可以调用的方法") ;
	}
}
  