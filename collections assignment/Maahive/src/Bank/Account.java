package Bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Account {
	static Connection con=ConnectionCreater.createConnection();
    static PreparedStatement ps=null;

           public static boolean insertStudentToDB(Customer cust) throws SQLException {
	 boolean flag=false;
	
	String q="insert into Banks(firstname,lastname,balance,city)values(?,?,?,?)";
	 ps=con.prepareStatement(q);
	ps.setString(1, cust.getFirstname());
	ps.setString(2, cust.getLastname());
	int xm=cust.getBalance();
if(xm>1000) {
	ps.setInt(3, xm);
}
else {
	System.out.println("need >1000");
	
	return false;
	
}
	ps.setString(4, cust.getCity());
	int x=ps.executeUpdate();
	if(x==1) {
	flag=true;
	}
	return flag;
	
}
           public static String  add(int accno,int bal) throws SQLException, ClassNotFoundException {
        	   if(bal>0) {
        	  Statement st=con.createStatement();
       	       ResultSet rs=st.executeQuery("select * from Banks where Bankid="+accno);
       	  
            int totbal=0;
         
              while(rs.next()) {
            	
            	  String bala="balance";
               int s1=rs.getInt(bala);
               if(bal<0) {
           System.out.println("Cant perform");
               }
          if(totbal<=0)
            {
            System.out.println("Your amount is credited you have to pay Rs"+totbal);
            }    else {
             System. out.println("Your amount is credited Your balance is"+totbal);
           }
          }
        PreparedStatement pstmt = con.prepareStatement("update Banks set balance=? where Bankid="+accno);
     pstmt.setInt(1,totbal);
     
      int i = pstmt.executeUpdate();
      return "added";
          }
			return "Added Balance can not be Zero or negative";
           }
          
		
		public static void withdrwal(int accno1, int balanceWithdrawl) throws SQLException {
       	   Statement st=con.createStatement();  
           ResultSet rs=st.executeQuery("select * from Banks where Bankid="+accno1);
           int    totbal=0;
           while(rs.next()) {
           int s11=rs.getInt(4);
           totbal=s11-balanceWithdrawl;
           if(totbal<=0)
         {
           System.out.println("Insuff balanc"+totbal);
          }
           else
         {
           System. out.println("Your amount is debited Your balance is"+totbal);
            }
           PreparedStatement pstmt = con.prepareStatement("update Banks set balance=? where Bankid="+accno1);
             pstmt.setInt(1,totbal);
             int i = pstmt.executeUpdate();
           }}
           public static boolean deleteAccount(int accno) throws SQLException, ClassNotFoundException {
	String query = "delete from Banks where Bankid=?"; 
	ps=con.prepareStatement(query);
	ps.setInt(1,accno);
	int r=ps.executeUpdate();
	if(r>0) {
	System.out.println("AMOUNT Deleted SUCCESSFULLY");
return true;
	}
return false;
    }
           public static void showDetails( int accno) throws SQLException {
	 boolean flag=false;
	 System.out.println("_______________________________");
		Connection con=ConnectionCreater.createConnection();
		String q="select * from Banks where Bankid="+accno ;
		Statement stmt =con.createStatement();
		ResultSet set=stmt.executeQuery(q);
		while(set.next()) {
			int id=set.getInt(1);
			String firstname=set.getString(2);
			String lastname=set.getString(3);
			String city=set.getString(5);
			int balance=set.getInt(4);
			System.out.println("ID   "+     id);
			System.out.println("firstname    "+     firstname);
			System.out.println("lastname   "+    lastname);
			System.out.println("city    "+     city);
			System.out.println("balance   "+     balance);
		
			System.out.println("_____________________________________");
			
		}


	
}}




		


