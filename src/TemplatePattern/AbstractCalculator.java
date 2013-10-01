package TemplatePattern;

/**
 * 
 * 模板方法模式
 * 
 * 备注：
 * 		定义一个操作中算法的骨架，而将这些步骤延迟到子类中，模板方法使得子类可以不改变
 * 一个算法的结构即可重新定义该算法的某些特定步骤。
 * 
 * @author Mr-Simple
 *
 */
public abstract class AbstractCalculator {
	
	

	
	/**
	 * 计算方法,这是一个算法骨架,具体的实现则延迟到了子类
	 * @param exp
	 * @param opr
	 * @return
	 */
	public int calculate(String exp, String opr){
		// 获得两个操作数
		int[] arrNums = split(exp, opr) ;
		// 调用实际的计算方法,而这个方法的具体实现延迟到了子类
		return calculate( arrNums[0], arrNums[1] );
	}
	
	// 抽象方法,必须在子类中实现
	public abstract int calculate(int num1, int num2);
	
	
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
