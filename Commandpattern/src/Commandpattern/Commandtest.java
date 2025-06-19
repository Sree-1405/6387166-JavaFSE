package Commandpattern;

public class Commandtest {
public static void main(String[] args) {
	Light livingroomlight= new Light();
	
	Command lighton=new Lightoncommand(livingroomlight);
	Command lightof=new Lightoffcommand(livingroomlight);
	
	Remotecontrol remote=new Remotecontrol();
	
	System.out.println("\n--turning on the light--");
	remote.setCommand(lighton);
	remote.pressButton();
	
	System.out.println("\n--turning off the light--");
	remote.setCommand(lightof);
	remote.pressButton();
}
}
