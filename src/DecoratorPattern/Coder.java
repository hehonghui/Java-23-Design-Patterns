package DecoratorPattern;

/**
 * 程序员类,实现了使用计算机接口中的方法useComputer
 * @author Mr-Simple
 *
 */
public class Coder implements CommonInterface {

	@Override
	public void useComputer() {
		System.out.println("Coder, use computer to coding...");
	}

}
