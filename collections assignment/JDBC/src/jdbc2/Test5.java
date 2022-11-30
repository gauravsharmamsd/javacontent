package jdbc2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test5 {
	static Connection c=null;
	static Scanner sc =new Scanner(System.in);
	static ConnectorClass con =new ConnectorClass();
	static Statement st=null;

public static void main(String[] args) throws SQLException {
	    st=con.createConnection().createStatement();
		String q1="select * from employee where sal>20000";
		String q2="update employee set sal=sal-2520";
		String query=sc.next();
	    boolean ch= st.execute(query);
	    if(ch) {
		   ResultSet set =st.getResultSet();
		   while(set.next()) {
			   System.out.println(set.getInt(1)+"  "+set.getString(2));
			   System.out.println("Record has been Entered");
		   }
	   }
	    else {
	    	int j=st.getUpdateCount();
	    	System.out.println("Succesful updation");
	    }
}
}
