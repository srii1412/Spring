package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Bean.Laptop;

public class Main {
	public  static void main(String[]args) {
	ApplicationContext context = new  ClassPathXmlApplicationContext("Resources/Application.xml");
	Laptop l = context.getBean("lap1",Laptop.class);
	
	}

}
