package jdbc2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.Scanner;

public class Test1 {
static Statement st=null;
static Scanner sc =new Scanner(System.in);
static Connection conn=null;
 static ConnectorClass c=new ConnectorClass();

	public static void main(String[] args) throws SQLException {
		
  while(true) {
   System.out.println("Name");
   String ename =sc.next();
   System.out.println("id");
int id =sc.nextInt();
   System.out.println("sal");
   int sal =sc.nextInt();
  
	//Statement pmt=(Statement) connection.createStatement();
	
	//st.execute(MessageFormat.format(qry, "Abc"));

   
   
   
   
   //String q1="create table employee(ename varchar(15), id varchar(7),sal varchar(8))";
  String qry="create table {0}(FILE_ID int,ename varchar(15), id varchar(7),sal varchar(8),primary KEY (FILE_ID) )";
  st=c.createConnection().createStatement();
  st.execute(MessageFormat.format(qry, "Abc"));
  System.out.println("Table crwated");
	try{
		   st= c.createConnection().createStatement();
 // int x= st.executeUpdate(q1);
		   String q="insert into employee Abc("+id+" , '"+ename+"',"+sal+")";
           st.executeUpdate(q);
	       System.out.println("Data insetted succesfully");
	       System.out.println("do yu want another record    T?F");
	       String option=sc.next();
	       if(option.equals("F"))
	    	   break;
	}
	
	catch (Exception e) {
		e.printStackTrace();
	}
  }

	}}


