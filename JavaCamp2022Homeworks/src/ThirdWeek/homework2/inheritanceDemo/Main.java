package ThirdWeek.homework2.inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI=new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());//sınıflar referans tiptir ve base class ımız kendisini extend eden sınfların referansını tutar.

	}

}
