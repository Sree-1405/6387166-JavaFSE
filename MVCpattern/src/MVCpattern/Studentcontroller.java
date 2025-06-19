package MVCpattern;

public class Studentcontroller {
	private Student model;
	private Studentview view;
	
	public Studentcontroller(Student model,Studentview view) {
		this.model=model;
		this.view=view;
	}
	
	public void setStudentName(String name) {
		model.setName(name);
	}
	public void setStudentGrade(String grade) {
		model.setGrade(grade);
	}
	public String getStudentName() {
		return model.getName();
	}
	public String getStudentGrade() {
		return model.getGrade();
	}
	public void updateView() {
		view.displayStudentDetails(model.setId(),model.getName(),model.getGrade());
	}
}
