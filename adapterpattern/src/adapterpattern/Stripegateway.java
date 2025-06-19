package adapterpattern;

public class Stripegateway {
	public void makestripePayment(double amount) {
		System.out.println("payment of $" + amount + " processed via stripe.");
	}
}
