package adapterpattern;

public class Paypalgateway {
	public void sendPayment(double amount) {
		System.out.println("payment of $" + amount + " processed through paypal.");
	}
}
