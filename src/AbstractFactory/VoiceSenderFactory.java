package AbstractFactory;

import Factory.Sender;
import Factory.SenderFactory;

/**
 * 语音类型工厂
 * @author Mr-Simple
 *
 */
public class VoiceSenderFactory extends Factory {

	@Override
	public Sender createSender() {
		return new VoiceSender();
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]){
		// 使用具体工厂类实例化工厂对象
		Factory factory = new VoiceSenderFactory();
		// 使用工厂方法实例化具体对象
		Sender sender = factory.createSender();
		sender.send();
		
		factory = new MailFactory();
		sender = factory.createSender();
		sender.send();
		
	}

}
