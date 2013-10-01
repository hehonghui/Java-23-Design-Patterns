package VisitorPattern;  
/** 
 * @Title: DataStructure.java 
 * @Package VisitorPattern 
 * @Description:  数据结构类,可以接受访问者的访问,并且由访问者注入算法等
 * @author Mr.Simple bboyfeiyu@gmail.com 
 * @date Dec 18, 2012 4:50:50 PM 
 * @version V1.0 
 */
public class DataStructure implements IData {

	/**
	 * 接受访问
	 * (non-Javadoc)
	 * @see VisitorPattern.IData#accept(VisitorPattern.IVisitor)
	 */
	public void accept(IVisitor visitor) {
		// 访问者执行访问操作
		visitor.visite( this ) ;
	}

	/**
	 * 获取将要被访问的属性
	 * (non-Javadoc)
	 * @see VisitorPattern.IData#getDataStructure()
	 */
	@Override
	public String getDataStructure() {
		
		return "my datastructure";
	}


}
  