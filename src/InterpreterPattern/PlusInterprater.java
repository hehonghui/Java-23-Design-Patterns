package InterpreterPattern;  
/** 
 * @Title: Plus.java 
 * @Package InterpreterPattern 
 * @Description:  解释器模式的具体实现,加法解释器
 * @author Mr.Simple bboyfeiyu@gmail.com 
 * @date Dec 18, 2012 5:29:02 PM 
 * @version V1.0 
 */
public class PlusInterprater implements IInterpreter {
	
	/**
	 * 解释操作
	 * (non-Javadoc)
	 * @see InterpreterPattern.IInterpreter#interprete(InterpreterPattern.Context)
	 */
	@Override
	public int interprete(Context cont) {
		return cont.getNum1() - cont.getNum2();
	}

}
  