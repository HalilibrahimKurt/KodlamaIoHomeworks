
public class BaseKodlamaManager {
	public void creat(Person person) {
		System.out.println("Kayýt iþlemi tamamlandý: " + person.firstName);
	}
	
	public void repeat(Person person) {
		System.out.println("Silme iþlemi tamamlandý: " + person.firstName);
	}
	
	public void update(Person person) {
		System.out.println("Gülcelleme iþlemi tamamlandý: " + person.firstName);
	}
}
