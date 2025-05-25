package javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Student {
	@Value("Prem Chandra Reddy")
   private String name;
   private College college;

public College getCollege() {
	return college;
}

public void setCollege(College college) {
	this.college = college;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Student [name=" + name + ", college=" + college.getCollege()+ "]";
}

public Student(College college) {
	super();
	System.out.println(college.getCollege());
	this.college = college;
}


   
}


