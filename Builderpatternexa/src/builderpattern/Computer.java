package builderpattern;

public class Computer {
	private String CPU;
	private String RAM;
	private String storage;
	private String graphicscard;

	private Computer(Builder builder) {
		this.CPU=builder.CPU;
		this.RAM=builder.RAM;
		this.storage=builder.storage;
		this.graphicscard=builder.graphicscard;
	}
	
	public void displayconfig() {
		System.out.println("CPU: " + CPU);
		System.out.println("RAM: " + RAM);
		System.out.println("Storage: " + storage);
		System.out.println("Graphics Card: " + graphicscard);
	}
	public static class Builder {
		private String CPU;
		private String RAM;
		private String storage;
		private String graphicscard;
		
		public Builder(String CPU,String RAM) {
			this.CPU=CPU;
			this.RAM=RAM;
		}
		public Builder setstorage(String storage) {
			this.storage=storage;
			return this;
		}
		public Builder setgraphicscard(String graphicscard) {
			this.graphicscard=graphicscard;
			return this;
		}
		public Computer build() {
			return new Computer(this);
		}
	}

}
