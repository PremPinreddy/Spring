package bean_life_cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("bean_life_cycle/config.xml");
		
		Samosa s=(Samosa)context.getBean("s1");
		System.out.println(s);
		context.registerShutdownHook();
//		context.close();
		Thread.sleep(1000);
		Pepsi p=(Pepsi)context.getBean("p1");
		System.out.println(p);
	
		

	}

}
