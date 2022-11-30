import java.util.Scanner;

import jyoti.InvalidAccountException;

public class UI {
	private static Bank b=new Bank();
private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)  {
		showmenu();
		

	}

	private static void showmenu()  {
		System.out.println("press 1");
		System.out.println("press 1");
		System.out.println("press 1");
		System.out.println("press 1");
		System.out.println("press 1");
		while(true) {
			int x=sc.nextInt();
			switch(x) {
			case 1:
				String name=sc.next();
				int x1=sc.nextInt();
				try {
				b.openAccount(name, x1);
				
				}
				catch(InsufficientAmountException ae)
				{
					ae.printStackTrace();
				}
				break;
			case 2:
				int accno=sc.nextInt();
				try {
					b.closeAccount(accno);
				} catch (InvalidAccountException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				int Accno=sc.nextInt();
				try {
					b.AccountDetails(Accno);
				
			//	System.out.println("Name:"+act.getName()+" Account No:"+act.getAccno()+" Balance:"+act.getBalance());
					//System.out.println();
				} catch (InvalidAccountException e) {
				System.out.println(e.getMessage());
			
				}
				break;
			case 4:
				int accountno=sc.nextInt();
				int bal=sc.nextInt();
				try {
					b.depositAccount(bal,accountno);
				} catch (InvalidAccountException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			case 5:
				int account1no=sc.nextInt();
				int bala=sc.nextInt();
				try {
					b.depositAccount(bala,account1no);
				} catch (InvalidAccountException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}}}}