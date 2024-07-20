package subtraction1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("emp.xml");
	
	Sub s = (Sub)context.getBean("e");
	System.out.println(s);
	
	

	}

}
