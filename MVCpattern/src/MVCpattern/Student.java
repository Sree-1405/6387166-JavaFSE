package MVCpattern;

public class Student{
	private String name;
	private String id;
	private String grade;
	
	public Student(String name,String id,String grade) {
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	
	public String setId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade=grade;
	}
}