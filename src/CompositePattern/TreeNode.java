package CompositePattern;  

import java.util.Enumeration;
import java.util.Vector;

/** 
 * @Title: TreeNode.java 
 * @Package CompositePattern 
 * @Description:  数的节点类
 * @author Mr.Simple bboyfeiyu@gmail.com 
 * @date Dec 18, 2012 5:39:37 PM 
 * @version V1.0 
 */
public class TreeNode {
	private String mName;
	private TreeNode mParent;											// 父节点
	private Vector<TreeNode> mChildenNodes = new Vector<TreeNode>() ;	// 孩子节点
	
	/**
	 * 构造函数
	 * @param name
	 */
	public TreeNode(String name, TreeNode parent){
		mName = name;
		if( null != parent){
			setmParent( parent ) ;
		}else {
			System.out.println("我是根节点") ;
		}
	}
	
	public String getmName() {
		return mName;
	}
	
	public void setmName(String mName) {
		this.mName = mName;
	}
	
	public TreeNode getmParent() {
		return mParent;
	}
	
	
	public void setmParent(TreeNode mParent) {
		this.mParent = mParent;
	}
	
	/**
	 * 
	 * @Title: add 
	 * @Description: 增加孩子节点
	 * @param node    
	 * @return void    
	 * @throws
	 */
	public void add(TreeNode node){
		mChildenNodes.add( node ) ;
	}
	
	/**
	 * 移除孩子节点
	 * @Title: remove 
	 * @Description: 
	 * @param node    
	 * @return void    
	 * @throws
	 */
	public void remove(TreeNode node) {
		mChildenNodes.remove( node ) ;
	}
	
	/**
	 * 取得所有孩子元素
	 * @Title: getChilden 
	 * @Description: 
	 * @return    
	 * @return Enumeration<TreeNode>    
	 * @throws
	 */
	public Enumeration<TreeNode> getChilden(){
		return mChildenNodes.elements() ;
	}

	@Override
	public String toString() {
		return "我的父节点是: " + mParent.getmName() + ",我的名字叫: " + this.getmName();
	}
	
	
	
}
  