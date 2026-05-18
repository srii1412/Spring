package Bean;

public class InitCloseMethod {
	public  InitCloseMethod() {
		System.out.println("program started");
	}
	public void init() {
		System.out.println("system initialised");
	}
	
	public void destroy() {
		System.out.println("destroyed");
	}
}

