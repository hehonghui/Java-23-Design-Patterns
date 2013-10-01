package StrategyPattern;  
/** 
 * @Title: Test.java 
 * @Package StrategyPattern 
 * @Description:  
 * @author Mr.Simple bboyfeiyu@gmail.com 
 * @date Jan 8, 2013 12:02:04 PM 
 * @version V1.0 
 */
public class Test {
	public static void main(String[] args) {
		// 策略模式
		ICalculate cal = new PlusCalculate();
		int result = cal.calculate("2+5") ;
		System.out.println("2+5=" + result);	
	}
}
  