package MediatorPattern;  
/** 
 * @Title: IBuyer.java 
 * @Package MediatorPattern 
 * @Description:  人物接口,即买家和卖家的抽象
 * @author Mr.Simple bboyfeiyu@gmail.com 
 * @date Dec 18, 2012 5:04:23 PM 
 * @version V1.0 
 */
public abstract class Person {
	private IMediator mMediator;
	protected String mState ;
	
	/**
	 * 构造函数,委托一个中介
	 * @param mediator
	 */
	public Person(IMediator mediator){
		mMediator = mediator ;
	}
	
	/**
	 * 
	 * @Title: setState 
	 * @Description:  设置状态,买房状态或者卖方状态
	 * @param state    
	 * @return void    
	 * @throws
	 */
	public void  setState(String state) {
		mState = state ;
	}
	
	/**
	 * 
	 * @Title: getState 
	 * @Description: 
	 * @return String    
	 * @throws
	 */
	public String getState(){
		return mState ;
	}
	
	/**
	 * 
	 * @Title: getMediator 
	 * @Description: 
	 * @return    
	 * @return IMediator    
	 * @throws
	 */
	public IMediator getMediator() {
		return mMediator ;
	}
	
	// 抽象操作
	public abstract void action();
}
  