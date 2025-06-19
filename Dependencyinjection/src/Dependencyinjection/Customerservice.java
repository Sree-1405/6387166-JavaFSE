package Dependencyinjection;

public class Customerservice {
	private Customerrepository customerrepository;
	
	public Customerservice(Customerrepository customerrepository) {
		this.customerrepository=customerrepository;
	}
	
	public void displaycustomer(String id) {
		String customer=customerrepository.findCustomerById(id);
		System.out.println("customer details: " + customer);
	}
}
