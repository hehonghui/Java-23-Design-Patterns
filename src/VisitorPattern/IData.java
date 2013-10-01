package VisitorPattern;  
/** 
 * @Title: IData.java 
 * @Package VisitorPattern 
 * @Description:  数据结构接口
 * @author Mr.Simple bboyfeiyu@gmail.com 
 * @date Dec 18, 2012 4:49:21 PM 
 * @version V1.0 
 */
public interface IData {
	public void accept(IVisitor visitor) ;
	public String getDataStructure();
}
  