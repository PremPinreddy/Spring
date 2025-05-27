package Demo;

import java.sql.*;
class MySQLConnectionTest
{
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
			
			if(con.isClosed())
				  System.out.println("Connection is Closed");
			else
				System.out.println("Connection is Open");
			
			
		}
		catch (Exception e) {
                   e.printStackTrace();
		}
	}
}