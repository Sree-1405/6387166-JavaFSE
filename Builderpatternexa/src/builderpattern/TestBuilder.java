package builderpattern;

public class TestBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer comp=new Computer.Builder("Intel i5","16GB")
				.setstorage("512GB SSD")
				.setgraphicscard("NIVIDIA GTX 1650")
				.build();
		comp.displayconfig();
	}

}
