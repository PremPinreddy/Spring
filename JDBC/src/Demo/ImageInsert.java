package Demo;
import java.io.FileInputStream;
import java.sql.*;
public class ImageInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/DemoDB","root","root");
			
			String q="insert into imagetbl(image) value(?)";
//			String q="alter table imagetbl modify image longblob";
			PreparedStatement pstmt=con.prepareStatement(q);
			
			FileInputStream fis=new FileInputStream("C:\\Users\\PremChandraPinreddy\\Downloads\\RatanTata.jpg");
			
			pstmt.setBinaryStream(1, fis,fis.available());
			pstmt.executeUpdate();
			System.out.println("Inserted.....");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
