package adapterpattern;

public class Stripeadapter implements PaymentProcessor {
	private Stripegateway stripe;
	
	public Stripeadapter(Stripegateway stripe) {
		this.stripe=stripe;
	}
	@Override
	public void processPayment(double amount) {
		stripe.makestripePayment(amount);
	}
}
