package javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student std=(Student) context.getBean("getStudent");
		System.out.println(std);
		System.out.println(System.getProperty("java.version"));

	}

}
