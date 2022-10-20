package ThirdWeek.homework3.entities;

public class Course extends Base{

	private int price;

	public Course(int id, String name, int price) {
		super(id, name);
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
