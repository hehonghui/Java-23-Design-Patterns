package ObserverPattern;

/**
 * 被订阅的主题接口
 * @author Mr-Simple
 *
 */
public interface ISubject {
	// 增加订阅者
	public void addObserver(IObserver obsv);
	// 移除订阅者
	public void removeObserver(IObserver obsv);
	// 被订阅者自身出现变化
	public void priceChange();
	// 一旦出现变化则通知所有订阅者
	public void notifyAllObserver();
}
