package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext("autowire/autowireConfig.xml");
		
		Student s=(Student) context.getBean("s1");
		System.out.println(s);
		

	}

}
