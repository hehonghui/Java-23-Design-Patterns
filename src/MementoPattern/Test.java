package MementoPattern;

/**
 * 备忘录模式
 * 
 * 备注:
 * 		主要目的是保存一个对象的某个状态，以便在适当的时候恢复对象，个人觉得叫备份模式更形象些，
 * 	通俗的讲下：假设有原始类Original，Original中有各种属性，Original可以决定需要备份的属性，
 * 备忘录类Memento是用来存储Original的一些内部状态。
 * 类MementoStorage呢，就是一个用来存储备备忘录的，且只能存储，不能修改等操作。
 * @author Mr-Simple
 *
 */
public class Test {
	public static void main(String args[]){
		// 创建原始类
		Original org = new Original("Mr.Simple");
		
		// 创建存储备忘录的对象,将org对象的数据备份起来
		MementoStorage ms = new MementoStorage( org.createMemento() ) ;
		println("原始数据为: " + org.getName() );
		// 修改对象的原始数据
		org.setName("Hello") ;
		println("修改后的数据为: " + org.getName() );
		
		// 从备忘录中恢复数据
		org.restoreFromMemento( ms.getMemento() ) ;
		println("从备忘录中恢复后 " + org.getName() );
		
	}
	
	/**
	 * 
	 * @param msg
	 */
	private static void println(String msg){
		System.out.println( msg ) ;
	}
}
