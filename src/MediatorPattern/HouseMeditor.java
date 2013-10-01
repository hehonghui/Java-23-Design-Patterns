package MediatorPattern;  
/** 
 * @Title: HouseMeditor.java 
 * @Package MediatorPattern 
 * @Description:  房屋中介者,处理卖房者与买房者的交互,使得双方解耦
 * @author Mr.Simple bboyfeiyu@gmail.com 
 * @date Dec 18, 2012 5:03:09 PM 
 * @version V1.0 
 */
public class HouseMeditor implements IMediator{

	private Person mBuyer;		// 买房者
	private Person mSeller;		// 卖房者
	
	/**
	 * 创建中介
	 * (non-Javadoc)
	 * @see MediatorPattern.IMediator#createMeditor()
	 */
	@Override
	public void createMeditor() {
		mBuyer = new HouseBuyer( this ) ;
		mSeller = new HouseSeller( this ) ;
	}

	/**
	 * 用户处理各个对象间的交互,使得对象间解耦
	 * (non-Javadoc)
	 * @see MediatorPattern.IMediator#workAll()
	 */
	@Override
	public void workAll() {
		// 卖房者卖房操作
		mSeller.action() ;
		// 设置状态
		mSeller.setState("sell") ;
		if ( mSeller.getState().equals("sell") ) {
			System.out.println("我是中介: 有人卖房啦!买家快来买!") ;
			// 如果有人卖房,则买房者买房
			mBuyer.action() ;
		}

	}

}
  