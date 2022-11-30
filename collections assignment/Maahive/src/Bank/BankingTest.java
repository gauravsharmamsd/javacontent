package Bank;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.Test;

class BankingTest {

	@Test
	public void openAccount() throws SQLException {
	Bank b=new Bank();
	String fname="A";
	String lname="B";
	int bal=2000;
	String city="H";
    Account acct=new Account();
    Customer c =new Customer(fname,lname,bal,city);
   boolean result= acct.insertStudentToDB(c);
	assertEquals(true,result);
	
	}

	@Test
	
	public void closeAccount() throws SQLException, ClassNotFoundException {
		 Connection con=ConnectionCreater.createConnection();
		PreparedStatement ps=null;
		  Account acct=new Account();
		  int accno=23;
		  boolean p=acct.deleteAccount(accno);
		String query = "delete from Banks where Bankid=?"; 
		ps=con.prepareStatement(query);
		ps.setInt(1,accno);
		int r=ps.executeUpdate();

		//  boolean result= acct.insertStudentToDB(c);
		assertEquals(false,p);
		
	}
@Test
	
	public void add() throws SQLException, ClassNotFoundException {
		 Connection con=ConnectionCreater.createConnection();
		PreparedStatement ps=null;
		  Account acct=new Account();
		  int accno=25;
		  int balance=23;
		String result=acct.add(accno,balance);
		 Statement st=con.createStatement();
 	       ResultSet rs=st.executeQuery("select * from Banks where Bankid="+accno);
		
		assertEquals("Added Balance can not be Zero or negative", acct.add(accno,balance));
		
		
}
		
	}
	


