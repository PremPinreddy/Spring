package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.io.*;

public class TableCreateJDBC {
	public static void main(String args[])
	{
		try
		{
			//load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Creating a Connection
			String url="jdbc:mysql://localhost:3306/DemoDB";
			String username="root";
			String password="root";
			
			Connection con=DriverManager.getConnection(url,username,password);
			
			//Table creation query
			String q="create table Test302(tID int(10) primary key auto_increment, tName varchar(200) not NULL,tSalary int(10))";
			
			//Create Statement
			Statement stmt=con.createStatement();			
//			stmt.executeUpdate(q);			
			System.out.print("Table Created");
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Hi there ,Pls enter your name");
			String name=br.readLine();
			System.out.println("Pls enter you salary");
			int sal=Integer.parseInt(br.readLine());
			
			
			//Insert into Table
			String a="insert into Test302(tNAME, tSalary) values(?,?)";
			
			PreparedStatement pstmt=con.prepareStatement(a);
			
			//Set values for  ? in insert stmt
			
			pstmt.setString(1,name);
			pstmt.setInt(2, sal);
			
			pstmt.executeUpdate();
			
			System.out.println("Inserted into table");
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
