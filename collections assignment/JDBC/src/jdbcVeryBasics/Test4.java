package jdbcVeryBasics;

import java.sql.Connection;
import java.sql.Statement;

public class Test4 {

	public static void main(String[] args) {
		ConnectorClass c=new ConnectorClass();
		Statement st=null;
		Connection conn=null;
		String q="drop table student_rec";
		try {
		st=c.createConnection().createStatement();
		st.executeUpdate(q);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Table has been droped Succesfullluy");
		
		
		

	}

}
