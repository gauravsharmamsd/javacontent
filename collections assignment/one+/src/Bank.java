import java.util.Scanner;

public class Bank {
	static Scanner sc=new Scanner(System.in);
	private String BankName;
	private String BranchCode;
	private Account[] account = new Account[100];
	static Account ac;
	static int op;
	
	//Open Account
	public int openAccount(int amt,String name) throws InsufficientbalanceException  {
		if(amt<1000)
			throw new InsufficientbalanceException("ahh!!!sorry mate,,,need>1000 to open account");
		int accno=op+1;
		Account a = new Account(name,accno,amt);
		account[op++] = a;
		System.out.println(a);
		return 1;
	}
	//printing details of account
		public void printAccount() {
	
		for(int i=0;i<op;i++) {
			
			System.out.println(account[i]);
		}
		
	}
	public int search(int accNo) throws InvalidAccountException {
	if(accNo<0 )
		throw new InvalidAccountException("Accont no is not valid");
				for(int i=0;i<account.length;i++){
			if(accNo==account[i].getAccno()) {
				return i;
				
			}
				
					}
		return -1;
	
		
		
	}

	public void closeAccount(int accNo) throws InvalidAccountException {
		int index=search(accNo);
		
		for(int i=index;i<op;i++) {
			if(index<0)
				throw new InvalidAccountException("Sorry mate account is not here");
		account[i]=account[i+1];
		}
		if(index<0)
			throw new InvalidAccountException("Sorry mate account is not here");
		op=op-1;
		System.out.println("Account has been deleted succesfully");
	}

	public void deposit(int amount) throws InvalidAccountException {
	System.out.println("enter the account no ion whic amount added");
	int accNo=sc.nextInt();
	int index=search(accNo);
	if(index<0)
		throw new InvalidAccountException("ahh account no is not ther to deposit");
	
	System.out.println("your account balnce before depiosit   "+account[index].getBalance());
	account[index].setBalance(amount+account[index].getBalance());
	System.out.println(" the final ampunt   "+	account[index].getBalance());

	}

	public void withdrawl(int withdrawlamount) throws InvalidAccountException {
		System.out.println("enter the account no ion whic amount has to be withdraw");
		int accNo=sc.nextInt();
		int index=search(accNo);
		if(index<0)
			throw new InvalidAccountException("ahh account no is not ther to deposit");
		
		System.out.println("your account balnce before Withdrwa   "+account[index].getBalance());
		account[index].setBalance(account[index].getBalance()- withdrawlamount);
		System.out.println(" the final ampunt   "+	account[index].getBalance());

		
	}
	

	
}


