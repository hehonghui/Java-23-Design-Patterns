package CompositePattern;  

import java.util.Enumeration;

/** 
 * @Title: Tree.java 
 * @Package CompositePattern 
 * @Description:  组合模式
 * 		将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等.
 * @author Mr.Simple bboyfeiyu@gmail.com 
 * @date Dec 18, 2012 5:46:59 PM 
 * @version V1.0 
 */
public class Tree {

	private TreeNode mRoot ;
	
	/**
	 * 构造函数
	 * @param name
	 */
	public Tree(String name){
		mRoot = new TreeNode(name, null) ;
	}
	
	/**
	 * 
	 * @Title: setRoot 
	 * @Description: 
	 * @param root    
	 * @return void    
	 * @throws
	 */
	public void  setRoot(TreeNode root) {
		mRoot = root ;
	}
}
  