import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDemo {

public static boolean q(Student stud) throws SQLException {
	 boolean flag=false;
	Connection con=ConnectionCreater.createConnection();
	String q="insert into students(sname,sphone,scity)values(?,?,?)";
	PreparedStatement ps=con.prepareStatement(q);
	ps.setString(1, stud.getName());
	ps.setString(2, stud.getPhone());
	ps.setString(3, stud.getCity());
	ps.executeUpdate();
	flag=true;
	return flag;
	
}

public static boolean deleteStudent(int y) throws SQLException {
	 boolean flag=false;
	Connection con=ConnectionCreater.createConnection();
	String q="delete from students where sid=?";
	PreparedStatement ps=con.prepareStatement(q);
	ps.setInt(1, y);
	ps.executeUpdate();
	flag=true;
	return flag;
	
}

public static void showAll() throws SQLException {
	 boolean flag=false;
		Connection con=ConnectionCreater.createConnection();
		String q="select * from students";
		Statement stmt =con.createStatement();
		ResultSet set=stmt.executeQuery(q);
		while(set.next()) {
			int id=set.getInt(1);
			String name=set.getString(2);
			String phone=set.getString(3);
			String city=set.getString(4);
			System.out.println("ID"+     id);
			System.out.println("name"+     name);
			System.out.println("phone"+    phone);
			System.out.println("city"+     city);
			System.out.println("_____________________________________");
			
		}
			
	}
	
}
	
	

