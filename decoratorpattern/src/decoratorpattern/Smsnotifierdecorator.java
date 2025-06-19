package decoratorpattern;

public class Smsnotifierdecorator extends Notifierdecorator{
	public Smsnotifierdecorator(Notifier notifier) {
		super(notifier);
	}
	@Override
	public void send(String message) {
		super.send(message);
		sendSMS(message);
	}
	private void sendSMS(String message) {
		System.out.println("Sending sms: " + message);
	}
}
