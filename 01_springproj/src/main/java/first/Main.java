package first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.context1.xml");
		
		Car c = context.getBean(Car.class);
		c.carMethod();
		

	}

}
