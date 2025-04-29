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
        System.out.println( "Added to test git fetch!" );
        Student std=new Student(25, "Prem Chandra Reddy", "India");
        Student std1= new Student();
        std1.setstudentId(046);
        System.out.println(std1+"\n "+std);
    }
}

