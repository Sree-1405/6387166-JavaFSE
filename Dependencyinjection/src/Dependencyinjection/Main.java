package Dependencyinjection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customerrepository repository=new Customerresimpl();
		
		Customerservice service=new Customerservice(repository);
		
		service.displaycustomer("CUST003");
	}

}
