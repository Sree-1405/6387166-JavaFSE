package adapterpattern;

public class Paymenttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paypalgateway paypal=new Paypalgateway();
		PaymentProcessor paypaladapter=new Paypaladapter(paypal);
		paypaladapter.processPayment(200.00);
		
		Stripegateway stripe=new Stripegateway();
		PaymentProcessor stripeadapter=new Stripeadapter(stripe);
		stripeadapter.processPayment(350.00);
	}

}
