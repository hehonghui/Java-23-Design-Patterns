package MediatorPattern;  
/** 
 * @Title: HouseBuyer.java 
 * @Package MediatorPattern 
 * @Description:  买房者类
 * @author Mr.Simple bboyfeiyu@gmail.com 
 * @date Dec 18, 2012 5:05:26 PM 
 * @version V1.0 
 */
public class HouseBuyer extends Person {

	/**
	 * 构造函数
	 * @param mediator
	 */
	public HouseBuyer(IMediator mediator) {
		super(mediator);
	}

	/**
	 * 
	 * (non-Javadoc)
	 * @see MediatorPattern.Person#action()
	 */
	@Override
	public void action() {
		System.out.println("我是买房者,我要买房") ;
		
	}

}
  