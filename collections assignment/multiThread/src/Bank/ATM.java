package Bank;

public class ATM extends Thread {
	Bank bank =new Bank();
	
	public void run() {
		System.out.println("Current thread   "+getName());
		int balance =bank.withdraw(900);
		System.out.println(getName()+"  done now balnce   "+balance);
	}
}
