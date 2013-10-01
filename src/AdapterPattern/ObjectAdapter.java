package AdapterPattern;

/**
 * 
 * @author Mr-Simple
 *
 */
public class ObjectAdapter implements Target {

	private Source m_source ;
	
	/**
	 * 构造方法
	 * @param source
	 */
	public ObjectAdapter(Source source){
		m_source = source ;
	}
	
	/**
	 * Target的要适配的方法
	 */
	@Override
	public void doSomeThing() {
		m_source.doSomeThing() ;
	}

	/**
	 * 
	 */
	@Override
	public void whatever() {
		System.out.println("whatever function in ObjectAdapter") ;

	}

}
