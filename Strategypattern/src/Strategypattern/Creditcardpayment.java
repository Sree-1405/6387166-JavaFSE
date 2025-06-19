package Strategypattern;

public class Creditcardpayment implements Paymentstrategy{
	private String cardholder;
	private String cardnumber;
	
	public Creditcardpayment(String cardholder, String cardnumber) {
		this.cardnumber=cardnumber;
		this.cardholder=cardholder;
	}
	@Override
	public void pay(double amount) {
		System.out.println("paid ₹ "+ amount + " using credit card [holder: " + cardholder + "]");
	}
}
