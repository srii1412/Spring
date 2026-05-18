package Bean;

public class Mobile {
	private int price;
	private String name;
	public void setPrice(int price) {
		this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}
	private Battery capacity;
	public void setCapacity(Battery capacity) {
		this.capacity = capacity;
	}
	
	public void show() {
		System.out.println("price "+price);
		System.out.println("name "+name);
		System.out.println("capacity "+capacity);
	}
}

