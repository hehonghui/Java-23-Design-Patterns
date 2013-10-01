package ObserverPattern;

import java.util.Iterator;
import java.util.Vector;

/**
 * 房子,被订阅者.关注的是房价变化
 * @author Mr-Simple
 *
 */
public class HouseSubject implements ISubject {

	// 观察者集合
	private Vector<IObserver> m_Observers = new Vector<IObserver>();
	
	
	/**
	 * 增加订阅者
	 */
	@Override
	public void addObserver(IObserver obsv) {
		if ( !m_Observers.contains( obsv ) ){
			m_Observers.add( obsv ) ;
		}

	}

	/**
	 * 删除订阅者
	 */
	@Override
	public void removeObserver(IObserver obsv) {
		if ( m_Observers.contains( obsv ) ){
			m_Observers.remove( obsv ) ;
		}
	}

	/**
	 * 主题(被订阅者)发生变化,则通知所有订阅者
	 */
	@Override
	public void priceChange() {
		System.out.println("由于国家调控,北京别墅价格降到100万一栋!!!") ;
		// 通知所有订阅者
		notifyAllObserver();
	}

	/**
	 * 通知所有订阅者房价变化了
	 */
	@Override
	public void notifyAllObserver() {
		// 获得迭代器
		Iterator<IObserver> iter = m_Observers.iterator() ;
		while( iter.hasNext() ){
			IObserver obsv = iter.next() ;
			// 通知订阅者更新状态
			obsv.update() ;
		}

	}

}
