
public class StudentManager extends BaseKodlamaManager{

	public void courseRegistration(Student student) {
		System.out.println("Kurs kay�t i�lemi tamamland�:" + student.courseName);
	}
	
	public void deleteCourseRegistration(Student student) {
		System.out.println("Kurs kay�t silme i�lemi tamamland�: " + student.courseName);
	}

}
