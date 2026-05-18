package Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Bean.Printer;

public class Task7_main {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Resources/Application.xml");
		
		Printer p1=context.getBean("p",Printer.class);
		Printer p2=context.getBean("p",Printer.class);
		p1.show();
		p2.show();
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

	}

}

