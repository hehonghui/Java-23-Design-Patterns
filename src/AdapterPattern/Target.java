package AdapterPattern;

/**
 * 目标接口是Target，通过Adapter类，将Source的功能扩展到Target里
 * @author Mr-Simple
 *
 */
public interface Target {
	// 与源类中方法相同
	public void doSomeThing();
	// 新方法
	public void whatever();
}
