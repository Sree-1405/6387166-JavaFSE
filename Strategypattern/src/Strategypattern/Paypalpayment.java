package Strategypattern;

public class Paypalpayment implements Paymentstrategy{
	private String email;
	
	public Paypalpayment(String email) {
		this.email=email;
	}
	@Override
	public void pay(double amount) {
		System.out.println("paid ₹ " + amount + " using paypal [email " + email + "]");
	}
}
