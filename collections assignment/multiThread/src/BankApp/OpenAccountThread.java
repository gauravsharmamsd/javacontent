package BankApp;

import java.util.Scanner;

public class OpenAccountThread implements Runnable {
   
	@Override
	public void run() {
		customerDetails();
		
	}

	private void customerDetails() {
		Scanner sc =new Scanner(System.in);
	System.out.println("Enter your name ....");
	String name=sc.next();
	System.out.println("Enter your age");
	int age =sc.nextInt();
	System.out.println("Enter your Address");
	String address=sc.nextLine();
	System.out.println("Enter Opening Account Balance");
	int initialBal=sc.nextInt();
	openAccount(name,age,sddress,initialBal);
	
		
	}

}
