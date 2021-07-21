
public class Main {
	public static void main(String[] args) {
		Student student = new Student(1, "Halil İbrahim", "KURT", "halil@gmail.com", "JAVA & React Kurumsal Mimaride Yazılım Geliştirme");
		Instructor instructor = new Instructor(1, "Engin", "Demiroğ", "engin@gmail.com", "JAVA & React Kurumsal Mimaride Yazılım Geliştirme");
		User user = new User(1, "Aydın", "Söke", "aydin@gmail.com");
		
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
