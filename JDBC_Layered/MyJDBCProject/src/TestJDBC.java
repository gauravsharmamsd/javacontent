//All JDBC interfaces /classes are defined in java.sql package
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.xdevapi.PreparableStatement;

public class TestJDBC {
	private static Properties dbMap;
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 1. Load Driver Class into memory
		//MYSQL JDBC driver class name 
		dbMap= new Properties();//This is internally a HashTable
		dbMap.load(new FileReader("db.properties"));
		try {
			String driverName = getDriverName();
			String url        = getURL();
			String userid     = getuser();
			String pwd        = getPasswd();
			//Code should be independent of Data Base.
			Class.forName(driverName);
			Connection conn = DriverManager.getConnection(url, userid, pwd);
			System.out.println("Connection established");
			String sql = "create table Customer (fname varchar(40), lname varchar(50), age int(3))";
			String insertSQL = "insert into Customer values(?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(insertSQL);
			stmt.setString(1,c1.getFname());
			stmt.setString(2,c1.getLname());
			stmt.setInt(3,c1.getid());
			stmt.execute();
			//stmt.executeUpdate(sql);//this will create mytable2
			
			stmt.executeUpdate(insertSQL);
			String selectSQL = "select * from mytable2";
			ResultSet resultSet = stmt.executeQuery(selectSQL);
			//Iterate the resultSet  //internally it is a DB cursor
			while(resultSet.next()) {
				String fname = resultSet.getString("fname");//pass column name as arg to get value
				String lname = resultSet.getString("lname");//pass column name as arg to get value
				int age = resultSet.getInt("age");//pass column name as arg to get value
				System.out.println(fname+" ,"+lname+", "+age);			
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	private static String getPasswd() {
		
		return dbMap.getProperty("pwd");
	}

	private static String getuser() {
		// TODO Auto-generated method stub
		return dbMap.getProperty("uid");
	}

	private static String getURL() {
		// TODO Auto-generated method stub
		return dbMap.getProperty("url");
	}

	private static String getDriverName() {
		// TODO Auto-generated method stub
		return dbMap.getProperty("driver");
	}

}
