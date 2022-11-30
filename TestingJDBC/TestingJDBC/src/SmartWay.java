import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SmartWay {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Maahi", "root", "A2016ece@4701");
			
			System.out.println("Connection Established");
			
			String sql="create table mytable (fname varchar(40), lname varchar(20), age int(3))";
			
	     	Statement stmt1 = conn.createStatement();
			stmt1.executeUpdate(sql);
			
			String insertSql = "insert into mytable2 values(?,?,?)";
			PreparedStatement stmt=conn.prepareStatement(insertSql);
			
			stmt.setString(1, "Yogesh");
			stmt.setString(2, "Patil");
			stmt.setInt(3, 20);
			
			stmt1.executeUpdate(insertSql);
			
			stmt.execute();
			
			String selectSql = "select * from mytable2";
			
			ResultSet resultSet = stmt1.executeQuery(selectSql);
			
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

