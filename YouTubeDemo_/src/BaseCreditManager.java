
public abstract class BaseCreditManager implements ICreditManager{

	public abstract void calculate();
	
	public void save() {
		System.out.println("Kaydedildi"); //save metodu her iki sınfta(Teacher ve Military) da aynı işlemi yaptığı için kendimizi tekrar etmemek adına abstract sınıfları kullanırız.
	}
}
