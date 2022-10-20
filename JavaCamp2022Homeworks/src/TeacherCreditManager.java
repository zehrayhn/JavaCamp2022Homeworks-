
public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("Öğretmen kredisi hesaplandı");
		
	}

	public void save() {
		super.save();
		System.out.println("abc"); //save metodu her iki sınfta(Teacher ve Military) da aynı işlemi yaptığı için kendimizi tekrar etmemek adına abstract sınıfları kullanırız.
	}


	//bir sınıf sadece bir abstract sınıfı inherit edebilir.
	//bir sınıf sadece bir abstract class ı veya başka bir class ı inherit edebilir.
	//abstract class lar ve interface ler new lenemez.
	//java da sınıfı direkt ezebiliriz virtual yapmamıza gerek yok
}
