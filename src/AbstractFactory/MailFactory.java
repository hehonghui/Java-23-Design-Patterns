package AbstractFactory;

import Factory.MailSender;
import Factory.Sender;

/**
 * 具体的工厂类
 * @author Mr-Simple
 *
 */
public class MailFactory extends Factory {
	@Override
	public Sender createSender(){
		return new MailSender();
	}
}
