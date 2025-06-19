package Observerpattern;

public class Observerpatterntest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stockmarket stockmarket = new Stockmarket();
		
		Observer mobile1=new Mobileapp("mobile-001");
		Observer web1=new Webapp("webapp-alpha");
		
		stockmarket.registerObserver(mobile1);
		stockmarket.registerObserver(web1);
		
		System.out.println("\n--stock price updated 1---");
		stockmarket.setStock("AAPL",185.50);
		
		System.out.println("\n---stock price updated 2---");
		stockmarket.setStock("GOOGL",2730.25);
		
		stockmarket.removeObserver(mobile1);
		System.out.println("\n---stock price update 3 (after removing mobileapp)---");
		stockmarket.setStock("TSLA", 715.40);
		
		
	}

}
