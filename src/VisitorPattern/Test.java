package VisitorPattern;  
/** 
 * @Title: Test.java 
 * @Package VisitorPattern 
 * @Description:  
 * @author Mr.Simple bboyfeiyu@gmail.com 
 * @date Dec 18, 2012 4:56:39 PM 
 * @version V1.0 
 */
public class Test {
	public static void main(String args[]) {
		IVisitor visitor = new NewVisitor();
		IData data = new DataStructure();
		data.accept( visitor ) ;
		
	}
}
  