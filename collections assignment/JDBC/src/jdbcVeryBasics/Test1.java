package jdbcVeryBasics;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {
	static Statement st=null;
	public static void main(String[] args)  {
		
	ConnectorClass c=new ConnectorClass();
	//c.createConnection();
	  
	try {
		st=c.createConnection().createStatement();
	
	String q1="create table  emp2(eid int,ename varchar(5),esal int)";
	st.executeUpdate(q1);
	System.out.println("Table created______________");
	
 String q2="insert into emp2 values(111,'Gaur',1000)";
 String q3="insert into emp2 values(222,'Ajay',1500)";
 String q4="insert into emp2 values(333,'Suraj',2000)";
 String q5="insert into emp2 values(4444,'Monu',3500)";

 st.executeUpdate(q2);
 st.executeUpdate(q3);
 st.executeUpdate(q4);
 st.executeUpdate(q5);
 String q6="select * from emp2";
ResultSet set= st.executeQuery(q6);
while (set.next()) {
	System.out.println(set.getInt(1)+"   "+set.getString(2)+"  "+set.getInt(3));
}
//while (set.next()) {
//	System.out.println(set.getInt("eid")+"   "+set.getString("ename")+"  "+set.getInt("esal"));
//}

 }catch(SQLException e) {
 e.printStackTrace();
	 
 }
 finally {
	 try {
	 if(st!=null)
		 st.close();
	 if(c!=null)
		 c.createConnection().close();
 }
	 catch(SQLException e) {
		 e.printStackTrace();
			 
		 }
	 
 }
 
 

	}}
