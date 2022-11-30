
import java.sql.*;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class DatabaseClass {
	static Scanner sc = new Scanner(System.in);
	static PreparedStatement ps = null;
	static ConnectorClass c = new ConnectorClass();

	public static boolean saveInInvalidDB(String file[]) throws SQLException {
		System.out.println("Welcome in ");
		String query1 = "create table CustomerWithInValidDataTable(CutomerName varchar(80),Address varchar(80),order_value varchar(60))";
	    ps = c.createConnection().prepareStatement(query1);
		int x=ps.executeUpdate(query1);
		System.out.println(" Table Created Succesfully");
		
      
        String query = " insert into CustomerWithInValidDataTable values(?,?,?)";
     	ps = c.createConnection().prepareStatement(query);
     	  ps.setString(1, file[0]);
     	    ps.setString(2, file[1]);
     	   ps.setString(3, null);
        int x1= ps.executeUpdate();
        if(x1!=0) {
        System.out.println("....Query executed in Invalid Table......"+x1);
       	System.out.println("Data inserted Succesfully");
       	return true;
        }
		return false;}

	

	public static boolean saveRecord(String file[]) throws SQLException {
//		String query1 = "create table CustomerWithValidDataTable(CutomerName varchar(80),Address varchar(80),order_value varchar(60))";
//	 ps = c.createConnection().prepareStatement(query1);
// 	 int x=ps.executeUpdate(query1);
 	 System.out.println("ValidDataTable created succesfully.........");
 	String query = " insert into CustomerWithValidDataTable values(?,?,?)";

 	ps = c.createConnection().prepareStatement(query);
	System.out.println();
    ps.setString(1, file[0]);
    ps.setString(2, file[1]);
   ps.setString(3, file[2]);
 
   int x1= ps.executeUpdate();
   if(x1!=0) {
   System.out.println("....Query executed in Valid table......"+x1);
  
   return true;
   
	}

	return false;
}
}