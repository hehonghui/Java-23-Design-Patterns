package MementoPattern;

/**
 * 存储备忘录的类
 * @author Mr-Simple
 *
 */
public class MementoStorage {
	private Memento m_memento;

	/**
	 * 构造函数
	 * @param m_memento
	 */
	public MementoStorage(Memento m_memento) {
		super();
		this.m_memento = m_memento;
	}

	/**
	 * 获得备忘录
	 * @return
	 */
	public Memento getMemento() {
		return m_memento;
	}

	/**
	 * 设置备忘录
	 * @param m_memento
	 */
	public void setMemento(Memento m_memento) {
		this.m_memento = m_memento;
	}
	
	
}
