package decoratorpattern;

public class Emailnotifier implements Notifier{
	public void send(String message) {
		System.out.println("sending email: " + message);
	}
}
