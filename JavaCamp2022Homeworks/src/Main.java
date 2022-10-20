public class Main {

	public static void main(String[] args) {
		//interface ler genellikle iş yapan sınıfların(creditmanager,customerManager) operasyonlarını sadece imza seviyesinde yazarak yazılımda bağımlılığı korumak adına yapılan çalışmadır.(if lerden kurtarırız)
		//IoC Container
		CustomerManager customerManager=new CustomerManager(new Customer(), new MilitaryCreditManager());
	    customerManager.giveCredit();
	}

}
