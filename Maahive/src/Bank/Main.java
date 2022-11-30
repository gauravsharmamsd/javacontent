package Bank;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	   static Scanner sc=new Scanner(System.in);
			public static void main(String[] args) throws SQLException, ClassNotFoundException {
				
		
			while (true) {
				System.out.println("welcome babe");
				System.out.println("press 1 for open account");
				System.out.println("press 2 for Delete account");
				System.out.println("press 3 for Add AccountBalance");
				System.out.println("press 4 for Withdrwal account");
				System.out.println("press 5 for show account");
				System.out.println("Enter ur choice____________");
				int x=sc.nextInt();
				switch(x) {
				case 1: System.out.println("Enter user firstname");
				String firstname=sc.next();
				System.out.println("Enter user lastname");
				String lastname=sc.next();
				 System.out.println("Enter balance to open account");
				int bal=sc.nextInt();
				System.out.println("Enter user city");
				String city=sc.next();
				Customer c=new Customer(firstname,lastname,bal,city);
				boolean ans=Account.InsertStudentToDB(c);
				if(ans==true) {
					System.out.println("Details goes to database");
				}
				else {
					System.out.println("Something went wrong");
				}
				System.out.println(c);
				break;
				
				case 2: 	
					System.out.println("Enter user AccountNo");
				int accno=sc.nextInt();
			    boolean search=Account.DeleteAccount(accno);
			    if(search==true) {
			    	System.out.println("Account no found");
			    }
			    else {
			    	System.out.println("Invalid details/accno");
			    }
			  
			    System.out.println("Account deleted succesfully");
				break;
				   
				case 3:
					System.out.println("Enter user AccountNo");
					int accno1=sc.nextInt();
					System.out.println("Enter Account balance");
					int balanceAdded=sc.nextInt();
					
				  Account.Add(accno1,balanceAdded);
				  break;
				  
				case 4:
					System.out.println("Enter user AccountNo");
					int accno11=sc.nextInt();
					System.out.println("Enter Account balance");
					int balanceWithdrawl=sc.nextInt();
					
				  Account.Withdrwal(accno11,balanceWithdrawl);
				  break;
				case 5:
					System.out.println("Enter user AccountNo");
					int accno111=sc.nextInt();
					  Account.ShowDetails(accno111);
				  break;
				    
		
				    
		
			
				
				
				
				
				}}}
			}