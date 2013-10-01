package CompositePattern;  

import java.util.Enumeration;

/** 
 * @Title: Test.java 
 * @Package CompositePattern 
 * @Description:  组合模式
 * 		使用场景：将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等。
 * @author Mr.Simple bboyfeiyu@gmail.com 
 * @date Dec 18, 2012 5:57:02 PM 
 * @version V1.0 
 */
public class Test {

	public static void main(String args[]) {
		// 数的根
		Tree tree = new Tree("RootTree") ;
		// 数的节点A
		TreeNode nodeA = new TreeNode("NodeA",null) ;
		// 数的节点A添加孩子节点
		nodeA.add(new TreeNode("NodeC", nodeA)) ;
		nodeA.add(new TreeNode("nodeD", nodeA)) ;
		
		// 节点B
		TreeNode nodeB = new TreeNode("NodeB", null) ;	
		nodeB.add(new TreeNode("B-child1", nodeB)) ;
		nodeB.add(new TreeNode("B-child2", nodeB)) ;
		tree.setRoot( nodeA ) ;
		
		System.out.println("数构建完成") ;
		
		/**
		 * 迭代输出
		 */
		for (Enumeration<TreeNode> childen = nodeB.getChilden(); childen.hasMoreElements(); ) {
			System.out.println( childen.nextElement() );
		}
	}
}
  