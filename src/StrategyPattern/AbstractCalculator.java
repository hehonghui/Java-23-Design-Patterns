package StrategyPattern;

/**
 * 辅助抽象类（可有可无，属于辅助类），提供辅助函数
 * @author Mr-Simple
 *
 */
public class AbstractCalculator {
	
	/**
	 * 分离操作数和运算符
	 * @param exp
	 * @param opr
	 * @return
	 */
	public int[] split(String exp, String opr){
		int[] arrInt = new int[2];
		// 获得两个操作数
		String[] oprNum = exp.split( opr ) ;
		arrInt[0] = Integer.parseInt(oprNum[0]) ;
		arrInt[1] = Integer.parseInt(oprNum[1]) ;
		
		return arrInt;
	}
}
