package Bean;

public class Laptop {
	private int price;
	private String Brand;
	private long storage;
	private String process;
		public Laptop(int price, String brand, long storage, String process) {
		super();
		this.price = price;
		Brand = brand;
		this.storage = storage;
		this.process = process;
	}
		public void disp() {
		System.out.println("Price:"+price);
		System.out.println("Brand:"+Brand);
		System.out.println("Storage:"+storage);
		}

}
