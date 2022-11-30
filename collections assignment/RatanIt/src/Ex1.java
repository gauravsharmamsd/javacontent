import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	
		System.out.println("Loading complete");
	
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sweet", "root", "A2016ece@4701");
		
		System.out.println("Connection created");
		}
		
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}	
		 catch (SQLException e) {
				
				e.printStackTrace();
			}
	}

}
