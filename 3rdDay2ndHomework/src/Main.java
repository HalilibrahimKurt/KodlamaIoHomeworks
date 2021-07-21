
public class Main {
	public static void main(String[] args) {
		Student student = new Student(1, "Halil �brahim", "KURT", "halil@gmail.com", "JAVA & React Kurumsal Mimaride Yaz�l�m Geli�tirme");
		Instructor instructor = new Instructor(1, "Engin", "Demiro�", "engin@gmail.com", "JAVA & React Kurumsal Mimaride Yaz�l�m Geli�tirme");
		User user = new User(1, "Ayd�n", "S�ke", "aydin@gmail.com");
		
		StudentManager studentManager = new StudentManager();
		studentManager.creat(student);
		studentManager.courseRegistration(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.creat(instructor);
		instructorManager.addCourse(instructor);
		
		UserManager userManager = new UserManager();
		userManager.creat(user);
	}
}
