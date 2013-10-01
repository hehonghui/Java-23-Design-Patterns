package CommandPattern;

/**
 * 将军类,负责发出命令
 * @author Mr-Simple
 *
 */
public class GeneralInvoker {

	private ICommand m_comd;
	
	/**
	 * 构造函数,传递命令
	 * @param comd
	 */
	public GeneralInvoker(ICommand comd){
		m_comd = comd ;
	}
	
	/**
	 * 将军发出命令
	 * 执行命令函数execute,而命令函数又调用IExecutor的executeCommand,实现松耦合
	 */
	public void command(){
		System.out.println("将军下令夺回钓鱼岛!!!") ;
		// 命令执行
		m_comd.execute() ;
	}
}
