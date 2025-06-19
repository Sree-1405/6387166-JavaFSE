package Observerpattern;

public class Webapp implements Observer{
	private String appname;
	
	public Webapp(String appname) {
		this.appname=appname;
	}
	@Override
	public void update(String stockname,double stockprice) {
		System.out.println("webapp [" + appname + "] - stock updated: " +stockname + " @ " +stockprice);
	}
}
