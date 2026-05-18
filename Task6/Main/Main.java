package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Bean.Mobile;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("task6/ApplicationContext.xml");
		
		Mobile m1=context.getBean("m",Mobile.class);
		m1.show();


	}

}

