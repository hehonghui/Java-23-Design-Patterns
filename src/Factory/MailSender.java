package Factory;

/**
 * 邮件发送
 * @author Mr-Simple
 *
 */
public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("I am mail sender...");

	}

}
