import java.util.Scanner;

public class UI {
private static Scanner sc=new Scanner(System.in);
static Account ac=new Account();
	public static void main(String[] args) {
	Bank b =new Bank();
		System.out.println("press 1 for open account");
		System.out.println("press 2  for close account");
		System.out.println("press 3 for deposit  account");
		System.out.println("press 4 for Withdraw account");
		System.out.println("press 5 for print  account");
		int opt=sc.nextInt();
		
			switch(opt) {
			case 1: b.openAccount();
			break;
		case 2: b.closeAccount(ac.getId());
		break;
	case 3: 
	break;
case 4: 
break;
case 5: 
break;
default: System.out.println("please choose valid option");
			
		

	}

	}}
