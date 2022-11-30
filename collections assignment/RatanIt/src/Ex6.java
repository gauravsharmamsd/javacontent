import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex6 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//ClassLoad
	Class.forName("com.mysql.cj.jdbc.Driver");
	Statement stmt=null;
	Connection conn=null;
	ResultSet set=null;
	//Connect
	 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Maahi", "root", "A2016ece@4701");
		System.out.println("Connection Established");
	
	String sql="create table Gaurav (Name varchar(40), Game varchar(20), age int(3))";

	String sql1="create table GauravKaushik (Name varchar(40), Game varchar(20), age int(3))";
	
	 stmt = conn.createStatement();
//	stmt.executeUpdate(sql);
//	stmt.executeUpdate(sql1);
//	
	
	System.out.println("Table created succesFully");
		String insertSql = "insert into Gaurav values(?,?,?)";
		PreparedStatement ps=conn.prepareStatement(insertSql);
				ps.setString(1, "Jitesh");
		        ps.setString(2, "Patil");
		        ps.setInt(3, 20);

		    	
				ps.execute();
				
				String selectSql = "select * from Gaurav";
				
				 set = stmt.executeQuery(selectSql);
				
			while(set.next()) {

				System.out.println(set.getString("Name")+"      "+set.getString("Game")+"    "+set.getInt("age"));
			}
			}
	

}
