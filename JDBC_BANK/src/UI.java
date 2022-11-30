import java.util.Scanner;

import javax.sql.rowset.JoinRowSet;

public class UI {

	static Scanner sc=new Scanner(System.in);
	static Bank bank=new Bank();
	static int brcode;
	public static void main(String[] args) {
		String bname="ICICI Bank";
		bank.setBankname(bname);
		brcode=12121;
		bank.setBranchcode(brcode);
		System.out.println("Welcome to "+bname+" Bank");
		while(true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\nEnter Your Choice");
			System.out.println("Press 1 to Open An Account");
			System.out.println("Press 2 to close An Account");
			System.out.println("Press 3 to make Deposit");
			System.out.println("Press 4 to Withdraw");
			System.out.println("Press 5 to your Account Detail");
			System.out.println("Press 6 to Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				openAccount();
				break;
			}
			case 2: {
				closeAccount();
				break;
			}

			case 3: {
				deposit();
				break;
			}
			case 4: {
				withdraw();
				break;
			}
			case 5: {
				accountDetail();
				break;
			}
			case 6:{
				System.exit(0);
				break;
			}
			default:
				System.out.println("Invalid Input please try again.");
			}

		}
	}


	private static void closeAccount() {
		try {
			System.out.println("Enter account number: ");
			int acno=sc.nextInt();
			bank.closeAccount(acno);
			System.out.println("Account Closed");
		} catch (InvalidAccountException e) {
			System.out.println(e.getMessage());
		}


	}
	private static void accountDetail() {
		System.out.println("Enter Account Number: ");
		int acno=sc.nextInt();
		try {
			bank.showAccountDetails(acno);
		} catch (InvalidAccountException e) {
			System.out.println(e.getMessage());
		}	
	}
	private static void withdraw() {
		try {
			System.out.println("Enter Account Number");
			int acno=sc.nextInt();
			System.out.println("Enter Amount for Withdraw:");
			int wt=sc.nextInt();
			bank.makeWithdraw(acno, wt);
			System.out.println("Rs "+wt+" is deducted from your account.");

		} catch (InvalidAccountException e) {
			System.out.println(e.getMessage());
		}
		catch(InsufficientAmountException e) {
			System.out.println(e.getMessage());
		}

	}
	private static void deposit() {
		try {
			System.out.println("Enter your account number");
			int acno=sc.nextInt();
			System.out.println("Enter amount to be deposited");
			int dep=sc.nextInt();
			if(dep>0) {
				bank.makeDeposit(acno, dep);
				System.out.println("Rs "+dep+" Successfully Deposited in your account.");
			}
			else {
				System.out.println("Cannot deposit negative ammount");
			}

		} catch (InvalidAccountException e) {
			System.out.println(e.getMessage());
		}



	}
	private static void openAccount() {
		//		System.out.println("Account opened");
		try {
			System.out.println("Enter name:");
			String name=sc.next();
			System.out.println("Enter mobille number");
			int mobno=sc.nextInt();
			System.out.println("Enter initial amount");
			int initamount=sc.nextInt();
			int acno=bank.openAccount(name, mobno,initamount,brcode);
			System.out.println("Hey "+name+" your account is successfully created your acount number is:"+acno);
		}
		catch (InsufficientAmountException e) {
			System.out.println(e.getMessage());
		}
	}


}

