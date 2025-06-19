package adapterpattern;

public class Paypaladapter implements PaymentProcessor{
	private Paypalgateway paypal;
	
	public Paypaladapter(Paypalgateway paypal) {
		this.paypal=paypal;
	}
	@Override
	public void processPayment(double amount) {
		paypal.sendPayment(amount);
	}
}
