package StrategyPattern;

/**
 * 用户定制的算法实现,以此体现多样化、灵活性
 * @author Mr-Simple
 *
 */
public class MultiplyCalculate extends AbstractCalculator implements ICalculate {

	/**
	 * 乘法运算
	 */
	@Override
	public int calculate(String exp) {

		// 调用抽象类的split方法获得操作数
		int[] arrInt = super.split(exp, "\\*"); 
		return arrInt[0] * arrInt[1] ;
	}

}
