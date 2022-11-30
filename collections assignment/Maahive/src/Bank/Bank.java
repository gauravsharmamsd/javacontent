package Bank;

import java.sql.SQLException;
import java.util.Scanner;

public class Bank {
	  static Scanner sc=new Scanner(System.in);

	public void open() throws SQLException 
	{System.out.println("Enter user firstname");
	String firstname=sc.next();
	System.out.println("Enter user lastname");
	String lastname=sc.next();
	 System.out.println("Enter balance to open account");
	int bal=sc.nextInt();
	System.out.println("Enter user city");
	String city=sc.next();
	Customer c=new Customer(firstname,lastname,bal,city);
	boolean ans=Account.insertStudentToDB(c);
	if(ans==true) {
		System.out.println("Details goes to database");
	}
	else {
		System.out.println("Something went wrong");
	}
	
		
	}

	public void delete() throws ClassNotFoundException, SQLException {
		System.out.println("Enter user AccountNo");
		int accno=sc.nextInt();
	    boolean search=Account.deleteAccount(accno);
	    if(search==true) {
	    	System.out.println("Account no found");
	    }
	    else {
	    	System.out.println("Invalid details/accno");
	    }
	  
	   
	
		
	}

	public void add() throws ClassNotFoundException, SQLException {
		System.out.println("Enter user AccountNo");
		int accno1=sc.nextInt();
		System.out.println("Enter Account balance");
		int balanceAdded=sc.nextInt();
		
	 String l= Account.add(accno1,balanceAdded);
		System.out.println(l);
	}

	public void withdraw() throws SQLException {
		System.out.println("Enter user AccountNo");
		int accno11=sc.nextInt();
		System.out.println("Enter Account balance");
		int balanceWithdrawl=sc.nextInt();
		
	  Account.withdrwal(accno11,balanceWithdrawl);
	}

	public void showDetails() throws SQLException {
		System.out.println("Enter user AccountNo");
		int accno111=sc.nextInt();
		  Account.showDetails(accno111);
	}
		
	}
	


