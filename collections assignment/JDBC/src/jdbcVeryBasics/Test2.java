package jdbcVeryBasics;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test2 {

	public static void main(String[] args) {
	ConnectorClass c=new ConnectorClass();
	Statement st=null;
	Connection conn=null;
	String q="create table student_rec(sid int(5),sname varchar(8),smarks int (6))";
	try {
		st=c.createConnection().createStatement();
		st.executeUpdate(q);
		System.out.println("Creation of table is done");
		String q1="insert into student_rec values(5,'Gaurav',20)";
		String q2="insert into student_rec values(6,'Kapil',30)";
		String q3="insert into student_rec values(7,'Jation',40)";
		st.executeUpdate(q1);
		st.executeUpdate(q2);
		st.executeUpdate(q3);
		System.out.println("Data inserted carefully");
		String q4="select * from student_rec";
		ResultSet set =st.executeQuery(q4);
		while(set.next()) {
			System.out.println(set.getInt(1)+"     "+set.getString(2)+"     "+set.getInt(3));
		}
				
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	

	}

}
