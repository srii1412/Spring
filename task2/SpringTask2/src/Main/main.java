package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Bean.Car;

public class main {
	public static void main(String[]args) {
  	ApplicationContext context = new Cla  ssPathXmlApplicationContext("Resources/App.xml");
      Car c = context.getBean(Car.class);
     c.show();
      
}
}