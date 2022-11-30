import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex2 {

	public static void main(String[] args) {
		Connection conn =null;
		ResultSet set=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	
		System.out.println("Loading complete");
	
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Ratan1", "root", "A2016ece@4701");
		
		System.out.println("Connection created succes");
		String q1="create table emp(fname varchar(40),lname varchar(40),age int(3))";
		Statement stmt =conn.createStatement();
		//int x=stmt.executeUpdate(q1);
		System.out.println("Table created Succesfully   ");
		String q2="insert into emp values('Rakesh','Virat',5)";
		stmt.executeUpdate(q2);
		System.out.println("Insertion start");
		String q3="select * from emp";
		set =stmt.executeQuery(q3);
		while(set.next()) {
			System.out.println(set.getString("fname")+"      "+set.getString("lname")+"    "+set.getInt("age"));
		}
		}
		
		
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}	
		 catch (SQLException e) {
				
				e.printStackTrace();
			}
	}

}
