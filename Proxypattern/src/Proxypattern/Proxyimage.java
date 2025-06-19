package Proxypattern;
import java.util.HashMap;
import java.util.Map;

public class Proxyimage implements Image{
	private static Map<String,Realimage> cache=new HashMap<>();
	private String filename;
	
	public Proxyimage(String filename) {
		this.filename=filename;
	}
	@Override
	public void display() {
		Realimage realimage=cache.get(filename);
		if(realimage==null) {
			System.out.println("image not cached. creating realimage object...");
			realimage=new Realimage(filename);
			cache.put(filename, realimage);
		}else {
			System.out.println("image found in cache.");
		}
		realimage.display();
	}
}
