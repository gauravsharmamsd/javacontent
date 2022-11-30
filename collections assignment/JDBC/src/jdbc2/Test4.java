package jdbc2;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test4 {
	static	ConnectorClass conn =new ConnectorClass();
	static Connection c=null;
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		
		Statement ps=conn.createConnection().createStatement();
		String q1="select* from employee";
		String q="update employee set sal=sal+120";
		
	
	boolean status =ps.execute(q);
	
	if(status) {
		ResultSet set=ps.getResultSet();
				
	while(set.next()) {
		System.out.println(set.getInt(1)+"   "+set.getString(2)+"    "+set.getInt(3));
	}
	System.out.println("updated rewcorded count");
	}
	else {
		int x=ps.getUpdateCount();
		System.out.println("updated");
	}
		
	}

}
