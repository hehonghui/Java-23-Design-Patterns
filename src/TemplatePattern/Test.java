package TemplatePattern;

/**
 * 
 * @author Mr-Simple
 *
 */
public class Test {
	
	/**
	 * 分析 ： 
	 * 	首先将exp和"\\+"做参数，调用AbstractCalculator类里的calculate(String,String)方法，
	 * 在calculate(String,String)里调用同类的split()，之后再调用calculate(int ,int)方法，
	 * 从这个方法进入到子类MultiplyCalculate中，执行完return num1 * num2后，
	 * 将值返回到AbstractCalculator类，赋给result，打印出来。
	 * 
	 * @param args
	 */
	public static void main(String args[]){
		AbstractCalculator cal = new MultiplyCalculate();
		int result = cal.calculate("3*6", "\\*") ;
		System.out.println("3*6 = " + result );
	}
}
