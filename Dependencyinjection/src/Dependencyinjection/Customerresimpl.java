package Dependencyinjection;

public class Customerresimpl implements Customerrepository{
	@Override
	public String findCustomerById(String id) {
		return "customer[id=" + id + ", name=sree]";
	}
}
