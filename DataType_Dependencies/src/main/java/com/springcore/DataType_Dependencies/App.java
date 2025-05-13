package com.springcore.DataType_Dependencies;
import collections.*;

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
        System.out.println( "Added to test git fetch!" );
        Student std=new Student(25, "Prem Chandra Reddy", "India");
        Student std1= new Student();
        std1.setstudentId(046);
        System.out.println(std1+"\n "+std);
        System.out.println("PWD: " + System.getProperty("user.dir"));
        
        ApplicationContext  context = new ClassPathXmlApplicationContext("com/springcore/DataType_Dependencies/config.xml");
        Student std2 = (Student) context.getBean("student1");
        
        Student std3 = (Student) context.getBean("student2");
        
        Student std4= (Student) context.getBean("student3");
        

        ApplicationContext  Empcontext = new ClassPathXmlApplicationContext("collections/config.xml");
        
        Emp emp1= (Emp) Empcontext.getBean("Employee1");
        
        System.out.println(std2);
        System.out.println(std3);
        System.out.println(std4);
        System.out.println(emp1);
    }
}

