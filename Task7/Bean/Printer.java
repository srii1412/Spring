package Bean;

public class Printer {
	
	private int count;
	private String work;
	public void setCount(int count) {
		this.count = count;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public void show() {
		System.out.println("count "+count);
		System.out.println("work "+work);
	}
}


