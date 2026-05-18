package Main;

public class Task9_main {
	 public static void main(String[] args) {

	        ApplicationContext context =
	                new ClassPathXmlApplicationContext("task9/ApplicationContext.xml");

	        Library lib = context.getBean("library", Library.class);

	        lib.display();
	    }


}
}
