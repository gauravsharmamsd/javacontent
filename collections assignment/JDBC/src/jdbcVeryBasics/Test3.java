package jdbcVeryBasics;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Test3 {
	static Statement st=null;
	static Connection conn=null;
	public static void main(String[] args) {
	ConnectorClass c=new ConnectorClass();
	
String q="update student_rec set smarks=smarks+2 where smarks>20";

try {
	st=c.createConnection().createStatement();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try {
	st.executeUpdate(q);
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}}

