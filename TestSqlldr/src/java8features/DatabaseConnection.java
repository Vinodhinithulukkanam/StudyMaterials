package java8features;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;


public class DatabaseConnection {
	
	
	public static Connection databaseconnection(){
		
		Connection con=null;
	try{
		System.out.println("DB con object created");
		  //   Class.forName("com.mysql.jdbc.Driver");
		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.44.113.31:1527:mpsdvlp1", "merch_fssnet_dit", "fssnet_dit107");
		con=DriverManager.getConnection(ResourceBundle.getBundle("config").getString("dburl"),ResourceBundle.getBundle("config").getString("username"),ResourceBundle.getBundle("config").getString("dbpassword"));
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	return con;
	}
	
	

}
