
public class StudentManager extends BaseKodlamaManager{

	public void courseRegistration(Student student) {
		System.out.println("Kurs kayýt iþlemi tamamlandý:" + student.courseName);
	}
	
	public void deleteCourseRegistration(Student student) {
		System.out.println("Kurs kayýt silme iþlemi tamamlandý: " + student.courseName);
	}

}
