package Bean;

public class Engine {
	private boolean work;
	private int capacity;
	public void setWork(boolean work) {
		this.work = work;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "work=" + work + ", capacity=" + capacity;
	}
	

}
