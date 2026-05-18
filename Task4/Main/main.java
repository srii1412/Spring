package Main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("task4/ApplicationContext.xml");
		
		Bean b1=context.getBean("b",Bean.class);
		b1.disp();
	

	}

}

