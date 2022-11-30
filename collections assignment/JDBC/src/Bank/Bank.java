package Bank;

import java.util.Scanner;

public class Bank {
	static Scanner sc =new Scanner(System.in);
static Account acc[]=new Account[100];
static int count;
public void openAccount(int amt) throws Exception {
	if(amt<1000) {
		throw new Exception("___________________low bal to opn");
	}
	   int accNo=count+1;
	   System.out.println("Enter name");
	   String name=sc.next();
	   System.out.println("Enter city");
	   String city =sc.next();
	   Account acct=new Account(amt,accNo,name,city);
	   acc[count++]=acct;
	   System.out.println(acct);
}
public int search(int accNo) {
	for(int i=0;i<count;i++) {
		if(accNo==acc[i].getAccNo()) {
			return i;
		
		}
		//System.out.println("not found");
	}
	return 0;
	
}
public void depositBalance(int accNo, int amt1) {
	int x=search(accNo);
	if(x>-1) {
	int prev=	acc[x].getBal();
	acc[x].setBal(prev+amt1);
	int current =acc[x].getBal();
	System.out.println("TotaL Balanace   "+current);
	}
	
}
public void withdrwal(int accNo11, int amt11) {
	int x=search(accNo11);
	if(x>-1) {
		System.out.println("prev.........."+acc[x].getBal());
		if(amt11<acc[x].getBal()) {
		acc[x].setBal(amt11-acc[x].getBal());
		System.out.println(acc[x].getBal());
	}
}
	
	
}
public void showDetail(int accNo111) {
int x=search(accNo111);
if(x>-1) {
	System.out.println("Show................"+acc[x]);
}
	
}   

}
