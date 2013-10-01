package StatePattern;  
/** 
 * @Title: Context.java 
 * @Package StatePattern 
 * @Description: TODO( 上下文环境 ) 
 * @author Mr.Simple bboyfeiyu@gmail.com 
 * @date Dec 18, 2012 4:29:22 PM 
 * @version V1.0 
 */
public class Context {
	private State mState;
	
	/**
	 * 构造函数
	 * @param state
	 */
	public Context(State state){
		mState = state;
	}
	
	/**
	 * 
	 * @Title: setState 
	 * @Description: TODO( 设置状态 ) 
	 * @param state    
	 * @return void    
	 * @throws
	 */
	public void setState(State state){
		mState = state;
	}
	
	/**
	 * 
	 * @Title: getState 
	 * @Description: TODO() 
	 * @return    
	 * @return State    
	 * @throws
	 */
	public State getState(){
		return mState ;
	}
	
	/**
	 * 
	 * @Title: action 
	 * @Description: TODO( 执行函数,根据不同的状态调用不同的方法,实现不同功能 )     
	 * @return void    
	 * @throws
	 */
	public void action(){
		// 根据不同的状态调用不同的方法
		if( mState.getState().equals( State.ONLINE )){
			mState.onLineAction() ;
		}else if ( mState.getState().equals( State.OFFLINE)) {
			mState.offLineAction() ;
		}
	}
}
  