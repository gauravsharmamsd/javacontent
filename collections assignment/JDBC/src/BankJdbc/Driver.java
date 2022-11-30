package BankJdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Driver {
	static PreparedStatement ps=null;
	static ConnectorClass c=new ConnectorClass();
    static Scanner sc =new Scanner(System.in);
    static Account ac=new Account();
    static int bal ;
    static int accountNumber;
    static int Cust_Acc;
	public String open(int bal) throws SQLException {
		if(bal>1000) {
			
		System.out.println("enter name of applicant");
		String name=sc.next();
		System.out.println("enter city of applicant");
		String city=sc.next();
		System.out.println("Enter pin code");
	    int pin=sc.nextInt();
	    ac =new Account(name,pin,city,bal);
 
	    boolean check=DatabaseClass.insertDetailsToDataBase(ac);
	
	    if(check ==true) {
	    	System.out.println("Details Filled please check in DB");
	    	int accountNo=	print();
	  	  System.out.println(ac  +"   Account no_"+accountNo);
	    
	    	
	    }}
		return "<1000 not valid";
		
	}
	public void deositInt(int Addedbalance, int accountNo) throws SQLException {
		
		int z=search(accountNo);
		if( z>0) {
			  String query4="update bankservice set Balance=balance+? where accNo="+accountNo;
		PreparedStatement ps = c.createConnection().prepareStatement(query4);
		ps.setInt(1, Addedbalance);
		//ps.executeUpdate();
	     int p=ps.executeUpdate();
	
		System.out.println("Account added succesfully");
		
		  }
		else {
			System.out.println("Accont no not found");
		}
  	  
	}
      int search(int accountNo) throws SQLException{
    	  if(accountNo>0) {
	  String query="select accNo from bankservice where accNo=?";
	       ps=c.createConnection().prepareStatement(query);
	       ps.setInt(1, accountNo);
	       ResultSet rs=ps.executeQuery();
	       while(rs.next()) {
	       accountNumber= rs.getInt("accNo");
	    	
	       }
	    
		return accountNumber ;
      }
		return -1;
}
	public void withdraw(int balance2, int account2) throws SQLException {
		int z=search(account2);
		int avb=checkBalance(account2);
	//	System.out.println(z);
		if( z>0 ) {
		if(avb>0 && avb>=balance2) {
		String query3="update bankservice set Balance =balance-? where accNo="+account2;
	    PreparedStatement ps = c.createConnection().prepareStatement(query3);
		ps.setInt(1, balance2);
	    int p=ps.executeUpdate();
		System.out.println("AccountBalance deduct3"
				+ " succesfully");
		}
	else {
			System.out.println("Insufficient acc");
			  }
		}else {
			System.out.println("Account no not found");
		}
		
	
	}
		public int checkBalance(int account6) throws SQLException {
			int zz=search(account6);
		
		     if(zz>0) {
				String q7="select balance from bankservice where accNo=?";
				 PreparedStatement ps = c.createConnection().prepareStatement(q7);
					ps.setInt(1, account6);
				ResultSet p=	ps.executeQuery();
				while(p.next()) {
					 bal=p.getInt("balance");}
				
						return bal;
			}
			
			return -1;
		
	}
	public void show(int account6) throws SQLException {
		int zz=search(account6);
		if(zz>0) {
			String q7="select * from bankservice where accNo=?";
			 PreparedStatement ps = c.createConnection().prepareStatement(q7);
				ps.setInt(1, account6);
			ResultSet p=	ps.executeQuery();
			while(p.next()) {
				System.out.println("Account no " +p.getInt(1)+"    "+"Account name"+" "+p.getString(2)+"   "+"Account pin"+"   "+p.getInt(3)+"  "+"Account city "+ ""+p.getString(4)+"  "+"Account bal"+" "+p.getInt(5));
			}
			
		}
		
	}
	public void delete(int account7) throws SQLException {
		int find= search(account7);
		if(find>0) {
			String q7="delete  from bankservice where accNo=?";
			 PreparedStatement ps = c.createConnection().prepareStatement(q7);
				ps.setInt(1, account7);
				ps.executeUpdate();
				System.out.println("Account deleted succesfully");
		}
		else {
			System.out.println("Account not found");
		}
		
	}
int print() throws SQLException{

		String query="select accNo from Bankservice where AccountHolderName= ?";
		ps=c.createConnection().prepareStatement(query);
		ps.setString(1, ac.getAcname());
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Cust_Acc=rs.getInt(1);;
		}
		return Cust_Acc;
	}
	  	  
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
