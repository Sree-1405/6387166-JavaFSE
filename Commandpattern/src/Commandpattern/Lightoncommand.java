package Commandpattern;

public class Lightoncommand implements Command{
	private Light light;
	
	public Lightoncommand(Light light) {
		this.light=light;
	}
	@Override
	public void execute() {
		light.turnon();
	}
}
