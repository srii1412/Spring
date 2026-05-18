package Bean;

public class Battery {
	private int capacity;
	

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Batery [capacity=" + capacity + "]";
	}
	
}
