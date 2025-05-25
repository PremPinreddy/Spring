package standlone_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PWD: " + System.getProperty("user.dir"));
		ApplicationContext context=new ClassPathXmlApplicationContext("standlone_collections/standaloneConfig.xml");
		Person p=(Person) context.getBean("p1");
		System.out.println(p);
	}

}
