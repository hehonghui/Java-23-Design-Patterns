package IteratorPattern;

/**
 * 
 * @author Mr-Simple
 *
 */
public class Test {
	public static void main(String args[]){
		// 实例化一个集合
		ICollection<Integer> list = new ListCollection<Integer>();
		list.add( 20 );
		list.add( -6 );
		list.add( 893 );
		list.add( 35 );
		list.add( 4 );
		
		// 获取迭代器
		Iterator<Integer> iter = list.iterator() ;
		// 通过迭代器访问集合元素
		while( iter.hasNext() ){
			int temp = iter.next();
			System.out.println("元素: " + temp) ;
		}
	}
}
