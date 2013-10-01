package InterpreterPattern;  
/** 
 * @Title: Test.java 
 * @Package InterpreterPattern 
 * @Description:  解释器模式
 * @author Mr.Simple bboyfeiyu@gmail.com 
 * @date Dec 18, 2012 5:32:37 PM 
 * @version V1.0 
 */
public class Test {
	public static void main(String args[]) {
		Context context = new Context(10, 4) ;
		// 加法解释器
		IInterpreter expression = new PlusInterprater();
		int result = expression.interprete( context ) ;
		System.out.println("Result : " + result) ;
	}
}
  