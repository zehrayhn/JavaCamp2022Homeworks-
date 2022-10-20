
public class Customer {

	private int id;
	private String firstName;
	private String lastName;


	private String City;
	
	public Customer(int id, String firstName, String lastName,  
			String city) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		
		
		City = city;
	}
	public Customer() {
		super();
		System.out.println("Müşteri nesnesi başlatıldı");
	}
	
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	
}
