package BankJdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Bank {
	static Scanner sc =new Scanner(System.in);
	static Driver d =new Driver();
public static void main(String[] args) throws Exception {
	showMenu();
}

private static void showMenu() throws Exception {
	while(true) {
	System.out.println("Enter 1 to open Account");
	System.out.println("Enter 2 to Deposit Account");
	System.out.println("Enter 3 to Withdrwa Account");
	System.out.println("Enter 4 to showDetaols Account");
	System.out.println("Enter 5 to Delete Account");
	
	System.out.println("Enter choice........................");
	int ch=sc.nextInt();
	switch(ch) {
	case 1:
	System.out.println("Enter bal to open Account");
	int bal=sc.nextInt();
		 openAccount(bal);
	break;
	
	case 2:
		System.out.println("Enter bal to add into Account");
		int balance=sc.nextInt();
		System.out.println("Enter Account to add into Account");
		int amount=sc.nextInt();
		Deposit(balance,amount);
		break;
		
		case 3:
			System.out.println("Enter bal to Withdraw into Account");
			int balance2=sc.nextInt();
			System.out.println("Enter Accountno to withdraw into Account");
			int account2=sc.nextInt();
			withdraw(balance2,account2);
			break;

		case 4:
			System.out.println("Enter AccountNo to show into Account");
			int account6=sc.nextInt();
			d.show(account6);
			
			break;

		case 5:
			System.out.println("Enter AccountNo to delete into Account");
			int account7=sc.nextInt();
			d.delete(account7);
			
			break;
		
		
		
		}
	}	
}


private static void withdraw(int balance2, int account2) throws SQLException {
	d.withdraw(balance2,account2);
	
}

private static void Deposit(int balance, int account) throws SQLException {
	
	d.deositInt(balance,account);
	
}

public static String openAccount(int bal) throws Exception {
	
	d.open(bal);
	return "GoodToGo";
	
	
	
}
}