package com.springcore.DataType_Dependencies;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	
	public void setstudentId(int studentId)
	{
		this.studentId=studentId;
	}
	public void setstudentName(String studentName)
	{
		this.studentName=studentName;
	}
	public void setstudentAddress(String studentAddress)
	{
		this.studentAddress=studentAddress;
	}
	
	public int getstudentId()
	{
		return studentId;
	}
	public String getstudentName()
	{
		return studentName;
	}
	public String getstudentAddress()
	{
		return studentAddress;
	}
	
	public Student(int studentId, String studentName ,String studentAddress)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentAddress=studentAddress;
	}
	
	
    public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
    public String toString()
    {
    	return "Student [studentId = "+ studentId +", studentName = "+studentName+", studentAddress = "+studentAddress+"]";
    			
    }
    
    
}
