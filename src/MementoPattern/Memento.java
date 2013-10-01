package MementoPattern;

/**
 * 备忘录类,用于存储Original的信息
 * @author Mr-Simple
 *
 */
public class Memento {
	private String value ;

	/**
	 * 构造函数
	 * @param value
	 */
	public Memento(String value) {
		super();
		this.value = value;
	}

	/**
	 * 获取数据
	 * @return
	 */
	public String getValue() {
		return value;
	}

	/**
	 * 设置数据
	 * @param value
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
