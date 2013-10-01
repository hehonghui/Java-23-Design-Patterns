package AdapterPattern;

/**
 * 
 * 继承自实现了目标接口的抽象类，这样就不必覆写接口中所有的方法，只需重写我们需要的方法就行。
 * 从而达到接口适配的效果。
 * @author Mr-Simple
 *
 */

public class InterfaceAdapter extends AbstractImpl {
	@Override
	public void doSomeThing(){
		System.out.println("接口适配器,只覆写我需要的方法doSomeThing") ;
	}
}

/**
 * 
 * @author Mr-Simple
 *
 */
class InterfaceAdapter2 extends AbstractImpl{
	@Override
	public void whatever(){
		System.out.println("接口适配器2,只覆写我需要的方法whatever") ;
	}
}
