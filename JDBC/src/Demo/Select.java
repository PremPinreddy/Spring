package Demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {
		
		try {
			Connection con=ConnectionProvider.getConnection();
			
			String q="select * from test302";			
			Statement stmt=con.createStatement();			
			ResultSet set=stmt.executeQuery(q);			
			while(set.next())
			{
				int id=set.getInt("tID");
				String name=set.getString("tname");
				int sal=set.getInt("tsalary");
				System.out.println("ID :"+id+"  name :"+name+"   salary :"+sal);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
