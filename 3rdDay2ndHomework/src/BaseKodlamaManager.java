
public class BaseKodlamaManager {
	public void creat(Person person) {
		System.out.println("Kay�t i�lemi tamamland�: " + person.firstName);
	}
	
	public void repeat(Person person) {
		System.out.println("Silme i�lemi tamamland�: " + person.firstName);
	}
	
	public void update(Person person) {
		System.out.println("G�lcelleme i�lemi tamamland�: " + person.firstName);
	}
}
