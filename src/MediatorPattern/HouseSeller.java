package MediatorPattern;  
/** 
 * @Title: HouseSeller.java 
 * @Package MediatorPattern 
 * @Description:  卖房者
 * @author Mr.Simple bboyfeiyu@gmail.com 
 * @date Dec 18, 2012 5:10:30 PM 
 * @version V1.0 
 */
public class HouseSeller extends Person {

	/**
	 * 构造函数,委托一个中介
	 * @param mediator
	 */
	public HouseSeller(IMediator mediator) {
		super( mediator );
	}

	/**
	 * 
	 * (non-Javadoc)
	 * @see MediatorPattern.Person#action()
	 */
	@Override
	public void action() {
		System.out.println("我是卖家,我要卖房") ;

	}

}
  