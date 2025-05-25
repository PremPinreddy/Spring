package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages ="javaconfig")
public class JavaConfig {
	
	@Bean
	public College getCollege()
	{
		return new College();
	}
	
	@Bean
	public Student getStudent() {
		Student std=new Student(getCollege());
		return std;
	}

	
	
    
}
