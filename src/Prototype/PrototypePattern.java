package Prototype;

/**
 * 原型模式
 * @author Mr-Simple
 *
 */
public class PrototypePattern {
	
	public static void main(String args[]){
		Person per = new Person("Sunny", 20);
		
		try{
			// 原型方法创建
			Person per2 = (Person)per.clone();
			System.out.println( per2 ) ;
			per2.showListItems() ;
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
	}
}
