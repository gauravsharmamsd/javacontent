package Bank;

public class Bank {
 static Account acct =new Account(1000);
 public int withdraw(int amount) {
	 synchronized(acct) {
	System.out.println(Thread.currentThread().getName()+" Check Balance");
	if(acct.getBalance()>amount) {
		System.out.println(Thread.currentThread().getName()+" you have all suff bal");
		int newBalance=acct.getBalance()-amount;
		System.out.println(Thread.currentThread().getName()+"About to set new bal");
		acct.setBalance(newBalance);
	}else {
		System.out.println(Thread.currentThread().getName()+" Err Insuff bal");
	}
	return acct.getBalance();
	
}}

}
