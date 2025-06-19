package decoratorpattern;

public abstract class Notifierdecorator implements Notifier {
	protected Notifier notifier;
	
	public Notifierdecorator(Notifier notifier) {
		this.notifier = notifier;
	}
	public void send(String message) {
		notifier.send(message);
	}

}
