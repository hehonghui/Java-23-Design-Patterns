package AdapterPattern;

/**
 * 单元测试
 * @author Mr-Simple
 *
 */
public class Test {
	public static void main(String args[]){
		// 类适配器
		Target target = new ClassAdapter();
		// 通过Adapter类，将Source的功能扩展到Target里
		target.doSomeThing();
		target.whatever() ;
		
		// 对象适配器
		Source src = new Source();
		ObjectAdapter adapter = new ObjectAdapter( src ) ;
		adapter.doSomeThing();
		adapter.whatever() ;
		
		
		// 接口适配器
		Target src2 = new InterfaceAdapter();
		src2.doSomeThing();
		src2.whatever();
		
		Target src3 = new InterfaceAdapter2();
		src3.doSomeThing();
		src3.whatever();

		
	}
}
