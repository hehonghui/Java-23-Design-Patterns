package AbstractFactory;

import Factory.Sender;

/**
 * 语音
 * @author Mr-Simple
 *
 */
public class VoiceSender implements Sender {

	@Override
	public void send() {
		System.out.println("I am a voice sender..");

	}

}
