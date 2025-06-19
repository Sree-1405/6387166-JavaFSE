package Proxypattern;

public class Realimage implements Image{
	private String filename;
	
	public Realimage(String filename) {
		this.filename=filename;
		loadFromRemoteServer();
	}
	private void loadFromRemoteServer() {
		System.out.println("loading image from remote server: " + filename);
	}
	@Override
	public void display() {
		System.out.println("displaying image: " + filename);
	}
}
