import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test3 {
public static void main(String[] args) {
	Statement stmt=null;
	ConnectorClass c=new ConnectorClass();
	String q="insert into student values('Gaurav','Kaushik',22)";
	String q1="insert into student values('Gaurav1','Kaushik2',221)";
	String q2="insert into student values('Gaurav2','Kaushik2',221)";
	
	try {	stmt = c.createConnection().createStatement();
		int xx=stmt.executeUpdate(q);
		int xx2=stmt.executeUpdate(q1);
		int xx3=stmt.executeUpdate(q2);
		System.out.println("data added");
		String selectSql = "select * from student";
		ResultSet resultSet = stmt.executeQuery(selectSql);
		
		while(resultSet.next()) {
			String fname = resultSet.getString("firstname");
			String lname = resultSet.getString("lastname");
			int age = resultSet.getInt("age");
			System.out.println(fname+", "+lname+", "+age);
		}}
catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}}
