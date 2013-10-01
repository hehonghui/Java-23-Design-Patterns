package CommandPattern;

/**
 * 上尉执行者
 * @author Mr-Simple
 *
 */
public class LieutenantExecutor implements IExecutor {

	/**
	 * 上尉执行命令
	 */
	@Override
	public void executeCommand() {
		System.out.println("上尉执行了命令!") ;

	}

}
