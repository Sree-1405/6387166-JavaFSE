package MVCpattern;

public class MVCtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student("sree","101","A");
		
		Studentview view=new Studentview();
		
		Studentcontroller controller=new Studentcontroller(student,view);
		
		controller.setStudentName("reddy");
		controller.setStudentGrade("A+");
		
		System.out.println("\n After updating details: ");
		controller.updateView();
	}

}
