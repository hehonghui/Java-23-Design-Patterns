package CommandPattern;

/**
 * 士兵,命令的执行者
 * @author Mr-Simple
 *
 */
public class SoldierExecutor implements IExecutor{
	/**
	 * 士兵执行命令
	 */
	public void executeCommand(){
		System.out.println("命令执行完毕--> 士兵带领三千城管夺回了钓鱼岛!") ;
	}
}
