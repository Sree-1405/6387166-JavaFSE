package decoratorpattern;

public class Slacknotifierdecorator extends Notifierdecorator {
	public Slacknotifierdecorator(Notifier notifier) {
		super(notifier);
	}
	@Override
	public void send(String message) {
		super.send(message);
		sendSlack(message);
	}
	private void sendSlack(String message) {
		System.out.println("sending slack: " +message);
	}
}
