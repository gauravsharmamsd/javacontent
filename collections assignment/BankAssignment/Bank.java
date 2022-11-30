
public class Bank {
static int counter;
static int flag;
private static String bannkame;
Account acc[]=new Account[Constants.MAX];
private static int branchcode;
//OPen
public void openAccount(String name,int accno,int initamount) 
if(initamount<1000)
	throw new InsufficientAmountException("Min bal must b 1000");
Account a=new Account(name,initamount,accno);
acc[counter++]=a;


}
