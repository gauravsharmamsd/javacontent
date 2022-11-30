package jdbc2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test3 {
	static	ConnectorClass conn =new ConnectorClass();
	static PreparedStatement ps=null;
	static Connection c=null;
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) throws SQLException {
		//String q="delete from employee  where sal<?";
		String q="select name,id from Bankdetails  where balance>?";
	ps=	conn.createConnection().prepareStatement(q);
	ps.setInt(1, 10000);
//	ps.setInt(2, 1000);
	ResultSet set=ps.executeQuery();
	while(set.next()) {
		System.out.println(set.getInt("id")+"   "+set.getString("name"));
	}
	System.out.println("updated rewcorded count");
		
		
		
	}

}
