package Commandpattern;

public class Lightoffcommand implements Command{
	private Light light;
	
	public Lightoffcommand(Light light) {
		this.light=light;
	}
	@Override
	public void execute() {
		light.turnoff();
	}
}
