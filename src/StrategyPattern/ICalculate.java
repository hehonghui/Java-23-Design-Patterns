package StrategyPattern;

/**
 * 公共的算法接口
 * 
 * 
 * 备注: 
 * 		策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，
 * 且算法的变化不会影响到使用算法的客户。需要设计一个接口，为一系列实现类提供统一的方法，
 * 多个实现类实现该接口;设计一个抽象类（可有可无，属于辅助类），提供辅助函数。
 * 
 * 		这种设计在框架中很常见,框架提供一个整体设计,具体的算法可有用户自己定制，
 * 只需实现框架提供的统一接口，然后进行注入即可。
 * 
 * @author Mr-Simple
 *
 */
public interface ICalculate {
	// 算法方法,由子类实现
	public int calculate(String exp);
}
