package Bank;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	static Bank d=new Bank();
	   static Scanner sc=new Scanner(System.in);
			public static void main(String[] args) throws SQLException, ClassNotFoundException {
				
		
			while (true) {
				System.out.println("welcome To Islamabad Bank of Pakistan");
				System.out.println("press 1 for open account");
				System.out.println("press 2 for Delete account");
				System.out.println("press 3 for Add AccountBalance");
				System.out.println("press 4 for Withdrwal account");
				System.out.println("press 5 for show account");
				System.out.println("Enter ur choice____________");
				int x=sc.nextInt();
				switch(x) {
				case 1: 
					d.open();
					break;
				
				case 2: 	
					d.delete();
						break;
				   
				case 3:
					d.add();
				  break;
				  
				case 4:
				d.withdraw();
				break;
				
				case 5:
					d.showDetails();
				  break;
			
							}}}}
			