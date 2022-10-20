package ThirdWeek.homework2.abstractClasses;

public abstract class GameCalculator {

	public abstract void hesapla(); //abstract snıfların içerisindeki abstract olan metodları o sınıfı extend eden tüm sınıflar kullanıp override etmelidir.
	
	public void gameOver() {
		System.out.println("oyun bitti");
	}
	
}

//abstract bir sınıfın abstract metodu olmak zorunda değildir.
//abstract sınfılar asla new lenemez!
//özet olarak abstract class zorunlu içi doldurulması gereken metodların varlığında kullanılır.