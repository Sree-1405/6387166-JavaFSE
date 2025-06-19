package decoratorpattern;

public class Notificationtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notifier notifier=new Emailnotifier();
		
		notifier = new Smsnotifierdecorator(notifier);
		
		notifier = new Slacknotifierdecorator(notifier);
		
		notifier.send("meeting at 6 pm");
	}

}
