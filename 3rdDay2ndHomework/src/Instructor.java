
public class Instructor extends Person{
	String courseName;

	public Instructor(int id, String firstName, String lastName, String email, String courseName) {
		super(id, firstName, lastName, email);
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	
	
	
	
}
