package ResponsibilityChainPattern;

/**
 * 事件处理器的抽象类
 * @author Mr-Simple
 *
 */
public abstract class AbstractHandler {
	private IHandler m_Handler = null;
	
	/**
	 * 设置处理者
	 * @param handler
	 */
	public void setHandler(IHandler handler){
		m_Handler = handler ;
	}
	
	/**
	 * 返回处理者
	 * @return
	 */
	public IHandler getHandler(){
		return m_Handler ;
	}
}
