package Bank;



import java.util.Scanner;


public class UI {
	static Scanner sc = new Scanner(System.in);
	static Bank bank = new Bank();
	public static void main(String[] args) throws Exception {
		displayMenu();
	}
	private static void displayMenu() throws Exception {
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
			case 1:System.out.println("Enter accBalance");
				int amt=sc.nextInt();
			
				bank.openAccount(amt);
					break;
			case 2:System.out.println("Enter accNo");
			int accNo=sc.nextInt();
		
			bank.search(accNo);
				break;
		
				
			case 3:System.out.println("Enter accNo");
			int accNo1=sc.nextInt();
			System.out.println("Enter accBalance");	int amt1=sc.nextInt();
			bank.depositBalance(accNo1,amt1);
				break;
		
			case 4:System.out.println("Enter accNo");
			int accNo11=sc.nextInt();
			System.out.println("Enter accBalance");	int amt11=sc.nextInt();
			bank.withdrwal(accNo11,amt11);
				break;

			case 5:System.out.println("Enter accNo");
			int accNo111=sc.nextInt();
			
			bank.showDetail(accNo111);
				break;
		
				
				
				
			case 6:System.exit(0);
					break;
			}
		}
		
	}
	
}
