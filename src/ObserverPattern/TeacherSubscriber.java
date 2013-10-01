package ObserverPattern;

/**
 * 老师订阅者的实现类,观察者类型
 * @author Mr-Simple
 *
 */
public class TeacherSubscriber implements IObserver{

	/**
	 * 订阅者状态更新
	 */
	@Override
	public void update() {
		System.out.println("我是老师订阅者,房价终于降下来啦!!!");

	}
	

}
