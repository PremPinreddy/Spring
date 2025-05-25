package stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("stereotype/stereotype.xml");
		Student std=(Student) context.getBean("student");
		
		System.out.println(std);
		System.out.println(std.getSubjects());
		System.out.println(std.getSubjects().getClass().getName());

	}

}
