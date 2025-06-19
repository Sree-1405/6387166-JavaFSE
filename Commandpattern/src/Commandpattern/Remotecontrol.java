package Commandpattern;

public class Remotecontrol {
	private Command command;
	
	public void setCommand(Command command) {
		this.command=command;
	}
	public void pressButton() {
		if(command != null) {
			command.execute();
		}else {
			System.out.println("no command set!");
		}
	}
}
