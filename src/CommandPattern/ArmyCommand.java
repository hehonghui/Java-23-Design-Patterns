package CommandPattern;

/**
 * 军队的命令
 * @author Mr-Simple
 *
 */
public class ArmyCommand implements ICommand {

	// 执行命令的人员(执行者)
	private IExecutor m_executor ;
	
	/**
	 * 构造函数,传递命令的执行者
	 * @param executor
	 */
	public ArmyCommand(IExecutor executor){
		m_executor = executor ;
	}
	
	/**
	 * 执行命令,实际上由m_executor调用具体的操作来实行
	 */
	@Override
	public void execute() {
		
		if( m_executor instanceof SoldierExecutor){
			System.out.println("士兵接到命令,火速前往目的地!!!") ;
		}else{
			System.out.println("上尉接到命令,火速前往目的地!!!") ;
		}
		// 执行者执行命令
		m_executor.executeCommand() ;
	}

}
