package Observerpattern;
import java.util.ArrayList;
import java.util.List;
public class Stockmarket implements Stock{
	private List<Observer> observers=new ArrayList<>();
	private String stockname;
	private double stockprice;
	
	public void setStock(String stockname, double stockprice) {
		this.stockname=stockname;
		this.stockprice=stockprice;
		notifyObservers();
	}
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	@Override
	public void notifyObservers() {
		for(Observer o : observers) {
			o.update(stockname,stockprice);
		}
	}
	
}
