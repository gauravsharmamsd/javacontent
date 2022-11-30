import java.sql.*;
public class ConnectionCreater {
	  static Connection conn ;
  public static  Connection  createConnection() {

	  try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","A2016ece@4701");
	} 
	  
	  catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return conn;
  }
}
