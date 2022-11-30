package jdbc2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test {
	static Connection c=null;
	static Scanner sc =new Scanner(System.in);
	static ConnectorClass con =new ConnectorClass();
	static Statement st=null;
	public static void main(String[] args) throws SQLException {
		 st=con.createConnection().createStatement();
		   String tableName = "Abcd";
				   String q1 = "Create table " + "tableName(sid int(5),sname varchar(15),ssal int(6))";
				   System.out.println("hfhgv");
//				   Statement statement = connection.createStatement(createTableSQL);
//				   statememt.execute();
		//  String q1="create table batch(sid int(5),sname varchar(15),ssal int(6))";
		  int y=st.executeUpdate(q1);
		  System.out.println(y);
		  
		  String q2="insert into tableName values(5,'Rahim',11)";
		  String q3="insert into tableName values(6,'Ram',12)";
		  String q4="insert into tableName values(7,'Sam',13)";
		  String q5="update tableName set ssal =ssal-15000";
		 // String q6="drop table batch";
  
 st.addBatch(q1);
   st.addBatch(q2);
   st.addBatch(q3);
   st.addBatch(q4);
   st.addBatch(q5);
  // st.addBatch(q6);
 
 int a[]=st.executeBatch();
 for(int x:a) {
	 System.out.println(x);
 }
	}

}
