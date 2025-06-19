package Strategypattern;

public class Strategytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paymentcontext context=new Paymentcontext();
		
		context.setpaymentstrategy(new Creditcardpayment("1234 1345 2346 3557","sree"));
		context.payableamount(2000);
		
		context.setpaymentstrategy(new Paypalpayment("sree@exml.com"));
		context.payableamount(3000);
	}

}
