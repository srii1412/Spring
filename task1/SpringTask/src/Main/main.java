package Main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Bean.WelcomeMessage;

public class main {
       public static void main(String[]args) {
    	  ApplicationContext context = new ClassPathXmlApplicationContext("Resources/Application.xml");
    	   WelcomeMessage w =  context.getBean(WelcomeMessage.class);
    	   w.show();
    
       }
}
