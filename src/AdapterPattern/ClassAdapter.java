package AdapterPattern;

/**
 * 类适配器
 * 
 * 备注:
 * 		目标接口是Target，通过Adapter类，将Source的功能doSomeThing()扩展到Target里。
 * 使用Source和Target的同名方法doSomeThing来实现。
 * @author Mr-Simple
 *
 */
public class ClassAdapter extends Source implements Target{

	/**
	 * Target中的方法
	 */
	@Override
	public void whatever() {
		System.out.println("whatever function in ClassAdapter") ;
	}

}
