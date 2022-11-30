package jyoti;


//import java.util.Random;

public class Bank {
	private String BankName;
	private String BranchCode;
	private Account[] account = new Account[100];
	static Account ac;
	static int op;
	
	//Open Account
	public Account openAccount(String name,int amt) throws InsufficientAmountException {
		if(amt<1000)
			throw new InsufficientAmountException("Intial Amount should be greater than 1000 to open Account");
		//Random rand = new Random();
		//int accno = (rand.nextInt(100)+1);
		int accno=op+1;
		Account a = new Account(name,accno,amt);
		account[op++] = a;
		return a;
	}
	//Close Account
	public void closeAccount(int accNo) throws InvalidAccountException {
		int accFound =searchAcct(accNo);
		if(accFound <0)
			throw new InvalidAccountException("Account No is not found,Please check your Account No.");
		Account a = AccountDetails(accNo);
		account[accFound]=null;
		//return accFound;
	}
	//Search Account based on account no
	private int searchAcct(int accno) {
		for(int i=0;i<op;i++) {
			if(account[i] == null) break;
			if(accno == account[i].getAccno())
				return i;
		}
		return -1;
	}
	//Print Account Details
	public Account AccountDetails(int accNo) throws InvalidAccountException {
		for(Account a :account) {
			if(a==null) 
				throw new InvalidAccountException("Account not found, Please check your account no"); 
			if(a.getAccno()!=accNo)
				throw new InvalidAccountException("Account not found, Please check your Account No."); 
			return a;
		}
		return null;
	}
	//Deposit
	public int deposit(int amount,int accno) throws InvalidAccountException {	
		int accFound =searchAcct(accno);
		if (accFound<0)
			throw new InvalidAccountException("Account not found,Please check your Account No.");
		int oldbalance = account[accFound].getBalance();
		account[accFound].setBalance(oldbalance + amount);
		return account[accFound].getBalance() ;
	}
	//Withdraw
	public int withdraw(int amount,int accno) throws InvalidAccountException, InsufficientAmountException {	
		int accFound =searchAcct(accno);
		if (accFound<0)
			throw new InvalidAccountException("Account not found,Please check your Account No.");
		int oldbalance = account[accFound].getBalance();
		if(oldbalance < amount){
			throw new InsufficientAmountException("No sufficient balance to withdraw amount.");
		}
		account[accFound].setBalance(oldbalance - amount);
		return account[accFound].getBalance() ;
	}
	
	
	
}
