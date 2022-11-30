import java.util.Scanner;

public class Client {
	static Scanner sc=new Scanner(System.in);
	String abc=sc.next();
Bank b= (Bank) BankFactory.getInstance(abc);
public static void main(String args[]) {
	
	Client c=new Client();
	double amount=c.b.calculateAmountAfterInterest(100,2);
	System.out.println(amount);
}
}

