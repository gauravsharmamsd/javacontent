import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {//class load
			Class.forName("com.mysql.cj.jdbc.Driver");
			//connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kasif", "root", "toor");
			System.out.println("Connection Established");
			String sql="create table mytable2 (fname varchar(40), lname varchar(20), age int(3))";
			Statement stmt = conn.createStatement();
			//stmt.executeUpdate(sql);
			String insertSql = "insert into mytable2 values('Rahul','Kumar',21)";
			stmt.executeUpdate(insertSql);
			String selectSql = "select * from mytable2";
			ResultSet resultSet = stmt.executeQuery(selectSql);
			
			while(resultSet.next()) {
				String fname = resultSet.getString("fname");
				String lname = resultSet.getString("lname");
				int age = resultSet.getInt("age");
				System.out.println(fname+", "+lname+", "+age);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
