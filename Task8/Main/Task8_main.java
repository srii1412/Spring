package Main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Bean.InitCloseMethod;

public class Task8_main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Resources/ApplicationContext.xml");
		InitCloseMethod method=context.getBean("i",InitCloseMethod.class);
		 ((AbstractApplicationContext) context).registerShutdownHook();
	}

}

