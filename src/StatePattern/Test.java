package StatePattern;  
/** 
 * @Title: Test.java 
 * @Package StatePattern 
 * @Description:  
 * @author Mr.Simple bboyfeiyu@gmail.com 
 * @date Dec 18, 2012 4:41:53 PM 
 * @version V1.0 
 */
public class Test {
	public static void main(String args[]){
		// 状态
		State state = new State("online");
		// 上下文环境
		Context context = new Context(state) ;
		context.action() ;
		// 改变状态
		state.setState("offline") ;
		context.setState( state ) ;
		context.action() ;
	}
	
}
  