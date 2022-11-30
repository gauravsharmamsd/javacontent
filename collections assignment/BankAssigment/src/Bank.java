import java.util.Scanner;

public class Bank {
private String bname;
private Account arr;
private int BranchCode;
private static Scanner sc =new Scanner(System.in);
Account ac =new Account();
public void openAccount() {
	int i=0;


	System.out.println("Enter name of Customer");
	String bname=sc.next();
	ac.setName(bname);
	System.out.println("Enter id of Customer");
	int id=sc.nextInt();
	ac.setId(id);
		printAccountDetails();
	
}
public void closeAccount(int accno) {
	int id=sc.nextInt();
ac.setId(id);
if(accno==id)
	System.out.println("id matched");

}
public void deposit() {
	
}
public void Withdraw() {

}
public void printAccountDetails() {
	System.out.println(ac.getName()+ "      "+ac.getId());
}
}
