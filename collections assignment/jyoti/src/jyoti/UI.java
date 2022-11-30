package jyoti;


import java.util.Scanner;


public class UI {
	static Scanner sc = new Scanner(System.in);
	static Bank bank = new Bank();
	public static void main(String[] args) {
		displayMenu();
	}
	private static void displayMenu() {
		System.out.println("Enter Bank Name");
		String bname = sc.next();
		System.out.println("Enter Branch Code");
		String bcode = sc.next();
		while(true) {			
			System.out.println("-----Menu-----");
			System.out.println("1:Open Account");
			System.out.println("2:Close Account");
			System.out.println("3:Deposit Amount");
			System.out.println("4:Withdraw Amount");
			System.out.println("5:Print Account Details");
			System.out.println("6:Exit");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:openAcct();
					break;
			case 2:closeAcct();
					break;
			case 3:deposit();
					break;
			case 4:withdraw();
					break;
			case 5:accDetails();
					break;
			case 6:System.exit(0);
					break;
			}
		}
		
	}
	private static void withdraw() {
		System.out.println("Enter Account No:");
		int acc = sc.nextInt();
		System.out.println("Enter amount to deposit:");
		int amt = sc.nextInt();
		try {
			bank.withdraw(amt, acc);		
		}catch(InvalidAccountException e) {
			System.out.println(e.getMessage());
		}catch(InsufficientAmountException e) {
			System.out.println(e.getMessage());
		}
		
	}
	private static void deposit() {
		System.out.println("Enter Account No:");
		int acc = sc.nextInt();

		System.out.println("Enter amount to deposit:");
		int amt = sc.nextInt();
		try {
			int a = bank.deposit(amt, acc);
			System.out.println("Deposited "+amt+" succesfully");		
		}catch(InvalidAccountException e) {
			System.out.println(e.getMessage());
		}
		
	}
	private static void closeAcct() {
		System.out.println("Enter Account No:");
		int acc = sc.nextInt();
		try {
			bank.closeAccount(acc);
			System.out.println("Closed Account Succesfully");
		}
		catch(InvalidAccountException e) {
			System.out.println(e.getMessage());
		}	
	}
	private static void accDetails() {
		System.out.println("Enter Account No");
		int accno = sc.nextInt();
		try {
		Account act=bank.AccountDetails(accno);


		}catch(InvalidAccountException e) {
			System.out.println(e.getMessage());
		}
	}
	private static void openAcct() {
		
		System.out.println("Enter your Name");
		String name = sc.next();
		System.out.println("Enter intial amount");
		int amt = sc.nextInt();
		try {
		Account a=bank.openAccount(name, amt);	
		System.out.println("Account created succesfully.");
		System.out.println("Account Details are:");
		System.out.println("Name:"+a.getName()+" Account No:"+a.getAccno()+" Balance:"+a.getBalance());
		}
		catch(InsufficientAmountException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
