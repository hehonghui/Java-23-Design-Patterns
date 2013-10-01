package ResponsibilityChainPattern;

public class MyHandler extends AbstractHandler implements IHandler {

	private String m_name;
	
	/**
	 * 构造函数
	 * @param name
	 */
	public MyHandler(String name){
		m_name = name ;
	}
	
	/**
	 * 事件处理,相当于冒泡事件,也类似于java的异常处理,可以选择处理与不处理,不处理则往下投递
	 */
	@Override
	public void handle() {
		// 获取处理器
		IHandler handler = this.getHandler() ;
		// 如果该事件有下一节点处理器,则抛给下一节点处理
		if( handler != null ){
			System.out.println(m_name + " 不处理事件,往下投递事件") ;
			// 处理事件
			handler.handle() ;
		}else{
			System.out.println(m_name + " 处理了事件.") ;
		}
	}

}
