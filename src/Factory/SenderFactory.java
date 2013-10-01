package Factory;

/**
 * 工厂方法,通过静态工厂方法创建对象
 * 
 * 备注: 如何增加产品类型则需增加该类的静态工厂方法
 * @author Mr-Simple
 *
 */
public class SenderFactory {
	/**
	 * 创建邮件发送者
	 * @return
	 */
	public static Sender createMailSender(){
		return new MailSender();
	}
	
	/**
	 * 创建短信发送者
	 * @return
	 */
	public static Sender createSmsSender(){
		return new SmsSender();
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]){
		Sender sender = SenderFactory.createMailSender();
		sender.send();
		
		sender = SenderFactory.createSmsSender();
		sender.send();
	}
}
