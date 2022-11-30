import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
public class JDBC {

	
		public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
			Properties p=new Properties();
			InputStream input =null;
			input=new FileInputStream("Abc.properties");
			p.load(input);
			String driverName=p.getProperty("driver");
			String url=p.getProperty("url");
			String userId=p.getProperty("uid");
			String pwd=p.getProperty("pwd");
	
			Class.forName(driverName);
			
	         Connection con=DriverManager.getConnection(url,userId,pwd);
	         
	         System.out.println("Connection established");
	        
			String sql="create table mytable4(fnaame varchar(40),lname varchar(40),age int(3))";
			
			Statement stmt=con.createStatement();
			String fname=null;
			String lname=null;
			String age=null;
		stmt.executeUpdate(sql);
			String insertSQL="insert into mytable4 values('fname','Kaushik','5')";
			stmt.executeUpdate(insertSQL);
			String selectSQL="select * from mytable4";
			ResultSet resultSet=stmt.executeQuery(selectSQL);
			while(resultSet.next()) {
			 fname=p.getProperty("fname");
				 lname=p.getProperty("lname");
                 age=p.getProperty("age");
                System.out.println(fname+"    "+lname+"  "+age);
				
				
			}
		}}
		

