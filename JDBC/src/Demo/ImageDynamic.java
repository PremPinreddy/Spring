package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JFileChooser;

public class ImageDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/DemoDB","root","root");
			
			String q="insert into imagetbl(image) value(?)";

			PreparedStatement pstmt=con.prepareStatement(q);
			
			JFileChooser jf=new JFileChooser();
			jf.showOpenDialog(null);
			File file = jf.getSelectedFile();
			FileInputStream fs=new FileInputStream(file);
			
			
			pstmt.setBinaryStream(1, fs, fs.available());
			pstmt.executeUpdate();
			
			System.out.println("Inserted successfully .......");
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
