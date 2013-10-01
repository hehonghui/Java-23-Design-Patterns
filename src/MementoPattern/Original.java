package MementoPattern;

/**
 * 要存储数据的类
 * @author Mr-Simple
 *
 */
public class Original {
	private String name;

	/**
	 * 构造函数
	 * @param name
	 */
	public Original(String name) {
		super();
		this.name = name;
	}

	/**
	 * 设置名字
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 获取名字
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 创建备忘录
	 * @return
	 */
	public Memento createMemento(){
		return new Memento( this.name );
	}
	
	/**
	 * 从备忘录中恢复
	 * @param memento
	 */
	public void restoreFromMemento(Memento memento){
		this.name =  memento.getValue() ;
	}
}
