package ResponsibilityChainPattern;


/**
 * 
 * 		责任链模式，有多个对象，每个对象持有对下一个对象的引用，这样就会形成一条链，
 * 请求在这条链上传递，直到某一对象决定处理该请求。但是发出者并不清楚到底最终那个对象
 * 会处理该请求，所以，责任链模式可以实现，在隐瞒客户端的情况下，对系统进行动态的调整。
 * 
 * @author Mr-Simple
 *
 */
public class Test {
	public static void main(String args[]){
		
		MyHandler h1 = new MyHandler("handler-1");
		MyHandler h2 = new MyHandler("handler-2");
		MyHandler h3 = new MyHandler("handler-3");
		
		// h1的下一处理节点为h2,即h1不处理事件,抛给h2
		h1.setHandler( h2 ) ;
		// h2的下一处理节点为h3,即h2不处理事件,最后抛给h3
		h2.setHandler( h3 ) ;
		// h1执行处理
		h1.handle() ;
	}
}
