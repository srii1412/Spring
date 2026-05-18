package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Bean.Employee;

public class main {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Resources/ApplicationContext.xml");
		
		Employee e1=context.getBean("e",Employee.class);
		e1.show();

	}

}


