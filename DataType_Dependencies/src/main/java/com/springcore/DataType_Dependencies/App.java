package com.springcore.DataType_Dependencies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student std=new Student(25, "Prem Chandra Reddy", "India");
        Student std1= new Student();
        std1.setstudentId(046);
        System.out.println(std1+"\n "+std);
        
        ApplicationContext  context = new ClassPathXmlApplicationContext("config.xml");
        Student std2 = (Student) context.getBean("student1");
        
        System.out.println(std2);
    }
}

