package Observerpattern;

public class Mobileapp implements Observer{
	private String appId;
	
	public Mobileapp(String appId) {
		this.appId=appId;
	}
	@Override
	public void update(String stockname,double stockprice) {
		System.out.println("mobileapp ["+ appId +"] - stock updated: " + stockname + " @ " + stockprice);
	}
}
