
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Ex4 {

	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		InputStream input =null;
		input=new FileInputStream("Abc.properties");
		p.load(input);
		String driverName=p.getProperty("driver");
		String url=p.getProperty("url");
		String userId=p.getProperty("uid");
		String pwd=p.getProperty("pwd");
		Connection conn =null;
		ResultSet set=null;
		Statement stmt=null;
		
		try {
			Class.forName(driverName);
	
		System.out.println("Loading complete");
	
			 conn=DriverManager.getConnection(url,userId,pwd);
		
		System.out.println("Connection created succes");
	//	String q1="create table emp(fname varchar(40),lname varchar(40),age int(3))";
       stmt =conn.createStatement();
		
		//int x=stmt.executeUpdate(q1);
		System.out.println("Table created Succesfully   ");
		String q21="insert into emp values('Rakesh','Virat',5)";
		String q22="insert into emp values('Gaurav','Kaushik',5)";
		String q23="insert into emp values('Amir','Sharma',55)";
		stmt.executeUpdate(q21);
		stmt.executeUpdate(q22);
		stmt.executeUpdate(q23);
		
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
