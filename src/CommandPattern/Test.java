package CommandPattern;

/**
 * 命令模式
 * 
 * 
 * 备注 ： 
 * 		命令模式很好理解，举个例子，司令员下令让士兵去干件事情，从整个事情的角度来考虑，
 * 司令员的作用是，发出口令，口令经过传递，传到了士兵耳朵里，士兵去执行。
 * 这个过程好在，三者相互解耦，任何一方都不用去依赖其他人，只需要做好自己的事儿就行，
 * 司令员要的是结果，不会去关注到底士兵是怎么实现的。
 * 
 * 
 * @author Mr-Simple
 *
 */
public class Test {
	public static void main(String args[]){
		
		/**
		 * 将军只管下达命令,命令中包含执行者,最后将军的命令被士兵或者上尉执行。
		 */
		
		// 士兵
		IExecutor soldier = new SoldierExecutor();
		// 实例化命令,传递命令的执行者
		ICommand comd = new ArmyCommand( soldier );
		// 将军对象实例化,传递命令
		GeneralInvoker invoker = new GeneralInvoker( comd );
		// 将军下命令
		invoker.command() ;
		
	}
}
