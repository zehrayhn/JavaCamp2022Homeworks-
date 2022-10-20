

public class CustomerManager {
	private Customer _customer;
	private ICreditManager _creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {
		this._customer=customer;
		this._creditManager=creditManager;
	}
	
	public void save() {
		System.out.println("Müşteri kaydedildi: ");
	}

	public void delete() {
		System.out.println("Müşteri silindi: ");
	}
	public void giveCredit() {
		_creditManager.calculate();//interface ler onu implemente eden sınıfların referansını tutabilir.
		System.out.println("Kredi verildi");
	}
}
