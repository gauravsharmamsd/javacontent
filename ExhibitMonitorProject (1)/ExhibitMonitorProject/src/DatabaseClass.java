
import java.sql.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DatabaseClass {
	static Scanner sc = new Scanner(System.in);
	static PreparedStatement ps = null;
	static ConnectorClass c = new ConnectorClass();

	public static boolean invalidFieldRecord(String fname, int lineno, String line)throws Exception {
		System.out.println("Hers we go");
   // String q=   "CREATE TABLE invalid_fields_record (  fname varchar(80), LineNo int(60), Data varchar(100))";
	//    ps = c.createConnection().prepareStatement(q);
	//    int x=ps.executeUpdate(q);	   
	//    System.out.println("Table created Succesfully " +x);	   
		
		String query="insert into invalid_fields_record (fname,LineNo,Data) values(?,?,?)";
		ps = c.createConnection().prepareStatement(query);
		System.out.println("Insertion done succesfully");
		
		ps.setString(1, fname);
		ps.setInt(2, lineno);
		ps.setString(3, line);
		int l=ps.executeUpdate();
		if(l!=0) {
			return true;
		
		}
		
		System.out.println("___data intery_______"+l);
		return false;
		
	}	
	
	
	
	
	
	public static boolean saveRecord(String file[], String outFileName) throws SQLException {
		  String tableName = outFileName;
		  System.out.println("name of this incoming file is nothing but....."+outFileName);
		  String inpt = outFileName.replace(".", "");
		  System.out.println(".................."+inpt);
//		  String query1 = "Create table  "+inpt +"(Student_ID int AUTO_INCREMENT PRIMARY KEY,CutomerName varchar(80),Address varchar(80),order_value varchar(60))";
//
//		
//	 ps = c.createConnection().prepareStatement(query1);
////
//	 int x=ps.executeUpdate(query1);
 	 System.out.println("ValidDataTable created succesfully.........");
 	 String query = " insert into  "+inpt +" (CutomerName,Address,order_value)values(?,?,?)";

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





	public static void ArrivedFiles(String outFileName, Date d) throws SQLException {
		System.out.println("Dat "+d);
//    String q=   "CREATE TABLE LookUp (  OutFileName varchar(80),  Date_ Date)";
//	ps=c.createConnection().prepareStatement(q)	;
//	ps.executeUpdate(q);
	System.out.println("Table create succesfully");
	String query="insert into LookUp (OutFileName,Date_) values(?,?)";
	ps = c.createConnection().prepareStatement(query);
    System.out.println("Data inserted Succesfully");
    ps.setString(1, outFileName);
    long time = d.getTime();
    
    ps.setDate(2, new java.sql.Date(time));
  //  ps.setDate(2, (java.sql.Date) d);
   // ps.setDate(2,  (java.sql.Date) d );
    int x1= ps.executeUpdate();
   
    System.out.println("....Query executed in Valid table......"+x1);

		
	}
	
}