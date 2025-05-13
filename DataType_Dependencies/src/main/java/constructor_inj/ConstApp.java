package constructor_inj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("PWD: " + System.getProperty("user.dir"));

		
		ApplicationContext context = new ClassPathXmlApplicationContext("constructor_inj/constconfig.xml");
		
		Person p1=(Person) context.getBean("person1");
		
		System.out.println(p1);
				

	}

}
