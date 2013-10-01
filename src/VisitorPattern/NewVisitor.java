package VisitorPattern;  
/** 
 * @Title: NewVisitor.java 
 * @Package VisitorPattern 
 * @Description:  
 * 		访问者模式把数据结构和作用于结构上的操作解耦合，使得操作集合可相对自由地演化。
 * 访问者模式适用于数据结构相对稳定算法又易变化的系统。
 * 若系统数据结构对象易于变化，经常有新的数据对象增加进来，则不适合使用访问者模式。
 * 访问者模式的优点是增加操作很容易，因为增加操作意味着增加新的访问者。访问者模式将有关行为集中到一个访问者对象中，
 * 其改变不影响系统数据结构。其缺点就是增加新的数据结构很困难。
 *简单来说，访问者模式就是一种分离对象数据结构与行为的方法，通过这种分离，可达到为一个被访问者动态添加新的操作而无需做其它的修改的效果。
 * @author Mr.Simple bboyfeiyu@gmail.com 
 * @date Dec 18, 2012 4:52:47 PM 
 * @version V1.0 
 */
public class NewVisitor implements IVisitor {

	/**
	 * 访问者访问数据
	 * (non-Javadoc)
	 * @see VisitorPattern.IVisitor#visite(VisitorPattern.IData)
	 */
	@Override
	public void visite(IData subject) {
		System.out.println("访问者访问 : " + subject.getDataStructure() ) ;
	}

}
  