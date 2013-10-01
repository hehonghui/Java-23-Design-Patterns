package TemplatePattern;

/**
 * 加法运算
 * @author Mr-Simple
 *
 */
public class PlusCalculate extends AbstractCalculator {

	/**
	 * 具体的计算方法
	 */
	@Override
	public int calculate(int num1, int num2) {
		return num1 + num2;
	}

}
