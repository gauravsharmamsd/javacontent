
import java.util.Scanner;

public class BankClient {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter bank name");
		String bankName=sc.next();
		Bank bank = BankFactory.getObject(bankName);
		bank.withdraw(100);
		

	}

}
