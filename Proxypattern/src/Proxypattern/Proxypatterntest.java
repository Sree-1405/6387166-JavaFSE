package Proxypattern;

public class Proxypatterntest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image image1=new Proxyimage("pic1.jpg");
		Image image2=new Proxyimage("pic2.jpg");
		Image image3=new Proxyimage("pic3.jpg");
		
		System.out.println("\n---first access to pic1.jpg---");
		image1.display();
		
		System.out.println("\n---first access to pic2.jpg---");
		image2.display();
		
		System.out.println("\n---second access to pic1.jpg");
		image3.display();

	}

}
