import java.util.Scanner;

public class UI {
	static Bank b=new Bank();
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		displayMenu();
	}
	private static void displayMenu() {
			System.out.println("choice!!!");
				
		while(true) {
		int x=sc.nextInt();
			switch(x) {
			case 1:
				System.out.println("enetr some ammount");
				int amt =sc.nextInt();
				System.out.println("entr the name");
				String Accname=sc.next();
				
				try {
					b.openAccount(amt,Accname);
				} catch (InsufficientbalanceException e) {
					
			System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println("Enetr the acc no that has to be deleted");
				int accNo=sc.nextInt();
				int pos = 0;
				try {
					pos = b.search(accNo);
				} catch (InvalidAccountException e) {
					System.out.println(e.getMessage());
					
				}
				System.out.println("Accound found posn    "+pos   +"at this posn");
				break;
			case 3:
				System.out.println("enetr the account to be deleted");
				int accNo1=sc.nextInt();
				try {
					b.closeAccount(accNo1);
				} catch (InvalidAccountException e) {
					
		System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("Enetr the amount to be deposit");
				int amount =sc.nextInt();
				try {
					b.deposit(amount);
				} catch (InvalidAccountException e) {
					System.out.println(e.getMessage());
				
				}
				break;
			case 5:
				System.out.println("Enetr the amount to be withdraw");
				int Withdrawlamount =sc.nextInt();
				try {
					b.withdrawl(Withdrawlamount);
				} catch (InvalidAccountException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 6:
				b.printAccount();
				break;
						}
		
		}
	}

}
