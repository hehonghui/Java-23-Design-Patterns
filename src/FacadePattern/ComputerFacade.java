package FacadePattern;

/**
 * 外观模式
 * 
 * 备注: 
 *     外观模式是为了解决类与类之家的依赖关系的，像spring一样，
 * 	可以将类和类之间的关系配置到配置文件中，而外观模式就是将他们的关系放在一个Facade类中，
 * 	降低了类类之间的耦合度。
 * 
 *     	在此以计算机启动为例,简单模拟CPU、内存、硬盘的启动,
 * 将类与类之间的关系全部集中到Facade中,降低耦合度。
 * 		如果我们没有Computer类，那么，CPU、Memory、Disk他们之间将会相互持有实例，
 * 产生关系，这样会造成严重的依赖。
 * 
 * @author Mr-Simple
 *
 */
public class ComputerFacade {

		private CPU cpu;
		private Memory memory;
		private Disk disk;
		
		/**
		 * 构造函数
		 */
		public ComputerFacade(){
			cpu = new CPU();
			memory = new Memory();
			disk = new Disk();
		}
		
		/**
		 * 启动
		 */
		public void startup(){
			System.out.println("开机...");
			cpu.startup();
			memory.startup();
			disk.startup();
			System.out.println("开机完毕!");
		}
		
		/**
		 * 关机
		 */
		public void shutdown(){
			System.out.println("开始关闭电脑!");
			cpu.shutdown();
			memory.shutdown();
			disk.shutdown();
			System.out.println("电脑已关闭!");
		}
}
