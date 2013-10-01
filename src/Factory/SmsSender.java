package Factory;

/**
 * 
 * @author Mr-Simple
 *
 */
public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("I am sms sender...");

	}

}
