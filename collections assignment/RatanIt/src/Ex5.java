import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Maahi", "root", "A2016ece@4701");
			
			System.out.println("Connection Established");
			
			String sql="create table mytable (fname varchar(40), lname varchar(20), age int(3))";
			System.out.println("Table created");
			
	     	Statement stmt = conn.createStatement();
		//	stmt1.executeUpdate(sql);
			
			String insertSql = "insert into mytable values(?,?,?)";
			System.out.println("inserted");
			PreparedStatement ps=conn.prepareStatement(insertSql);
			
			ps.setString(1, "Yogesh");
			ps.setString(2, "Patil");
			ps.setInt(3, 20);
			
		//	stmt.executeUpdate(insertSql);
			
			ps.execute();
			
			String selectSql = "select * from mytable";
			
			ResultSet resultSet = stmt.executeQuery(selectSql);
			
			while(resultSet.next()) {

				System.out.println(resultSet.getString("fname")+", "+resultSet.getString("lname")+", "+resultSet.getInt("age"));
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




