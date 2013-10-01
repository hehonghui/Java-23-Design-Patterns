package VisitorPattern;  
/** 
 * @Title: IVisitor.java 
 * @Package VisitorPattern 
 * @Description:  访问者接口
 * @author Mr.Simple bboyfeiyu@gmail.com 
 * @date Dec 18, 2012 4:48:00 PM 
 * @version V1.0 
 */
public interface IVisitor {
	public void visite(IData subject);
}
  