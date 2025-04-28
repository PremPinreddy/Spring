package com.springcore.DataType_Dependencies;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student std=new Student(25, "Prem Chandra Reddy", "Hyderabad");
        Student std1= new Student();
        std1.setstudentId(046);
        System.out.println(std1+"\n "+std);
    }
}

