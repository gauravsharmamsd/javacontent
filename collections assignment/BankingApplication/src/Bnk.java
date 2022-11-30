

import java.util.Scanner;

public class Bnk {
private String bname;
private static Act arr[]=new Act[5];
static Act ac=new Act();
private int BranchCode;
private static Scanner sc =new Scanner(System.in);
public static void showMenu() throws ThresHoldException, InvalidAccountException, InvalidIdException, LowBalanceException {
	System.out.println("Welcome");
	System.out.println("A:open Account");
	System.out.println("B:closeAccount");
	System.out.println("C:Deposit");
	System.out.println("D:withdraw");
	System.out.println("E:PrintAccountDetails");
	System.out.println("F.Exit");
	char ch;
do{
	System.out.println("Enetr the option");
ch=sc.next().charAt(0);
switch(ch) {
case 'A':
System.out.println("Account set to be open");

System.out.println("Your account ha been oppened with "+ ac.openAccount());
break;
case 'B':
System.out.println("Account set to be closed");
ac.closeAccount();
break;

case 'C':
System.out.println("Bakance to be deposit");
int amount=sc.nextInt();
ac.deposit(amount);
break;

case 'D':
System.out.println("Bakanceto be withdrawn");
int amount2=sc.nextInt();
ac.withdrawl(amount2);
break;
case 'E':
System.out.println("Account details");
System.out.println("Your account ha been oppened with "+ ac.openAccount());

break;
default : System.out.println("wrong");
break;
}
}
while(ch!='E');
System.out.println("thamks");
}
}
