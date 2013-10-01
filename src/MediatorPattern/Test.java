package MediatorPattern;  
/** 
 * @Title: Test.java 
 * @Package MediatorPattern 
 * @Description:  
 * @author Mr.Simple bboyfeiyu@gmail.com 
 * @date Dec 18, 2012 5:19:20 PM 
 * @version V1.0 
 */
public class Test {
	public static void main(String args[]) {
		// 房屋中介者
		HouseMeditor hMeditor = new HouseMeditor();
		// 创建中介者为买房者与卖房者服务
		hMeditor.createMeditor();
		// 中介工作,处理对象间的交互
		hMeditor.workAll() ;
	}
}
  