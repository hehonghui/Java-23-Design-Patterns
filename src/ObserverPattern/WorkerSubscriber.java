package ObserverPattern;

/**
 * 工人订阅者的实现类,即观察者
 * @author Mr-Simple
 *
 */
public class WorkerSubscriber implements IObserver {

	/**
	 * 订阅者状态更新
	 */
	@Override
	public void update() {
		System.out.println("我是工人订阅者,屌丝也能买别墅了!!!");

	}

}
