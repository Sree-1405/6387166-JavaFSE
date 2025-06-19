package Strategypattern;

public class Paymentcontext {
	private Paymentstrategy paymentstrategy;
	
	public void setpaymentstrategy(Paymentstrategy paymentstrategy) {
		this.paymentstrategy=paymentstrategy;
	}
	public void payableamount(double amount) {
		if(paymentstrategy==null) {
			System.out.println("no payment method selected!");
			return;
		}
		paymentstrategy.pay(amount);
	}
}
