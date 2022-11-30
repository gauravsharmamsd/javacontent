import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
 public class Test{
		public static void main(String[] args)  {
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
	        	 System.out.println("Connection");
		
			String sql="create table mytable3(fname varchar(40),lname varchar(40),age int(3))";
			Statement stmt=con.createStatement();
		//stmt.executeUpdate(sql);
			String insertSQL="insert into mytable3 values('sharma','Kaushik','5')";
			stmt.executeUpdate(insertSQL);
			String selectSQL="select * from mytable3";
			ResultSet resultSet=stmt.executeQuery(selectSQL);
			while(resultSet.next()) {
				String fname=resultSet.getString("fname");
				String lname=resultSet.getString("lname");
                int age=resultSet.getInt("age");
                System.out.println(fname+"    "+lname+"  "+age);
			}
				
			
		}}
		

