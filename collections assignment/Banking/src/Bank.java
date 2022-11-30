//import jyoti.Account;
//import jyoti.InvalidAccountException;

public class Bank {
	private String BankName;
	private String BranchCode;
	private Account[] account = new Account[100];
	static Account ac;
	static int op;
	public Account openAccount(String name, int x1) throws InsufficientAmountException {
		if(x1<1000) 
			throw new InsufficientAmountException("sorry Initail amount <1000 ");
			int accno=op+1;
			Account a=new Account(name,accno,x1);
			account[op++]=a;
		
		System.out.println(a);
		return a;
		
	}
		// TODO Auto-generated method stub
	public void closeAccount(int accno) throws InvalidAccountException {
		if (accno<0)
			throw new InvalidAccountException("sorry accno is not valid");
		int accFound=search(accno);
		account[accFound]=null;
		System.out.println("Accpunt close");
	//Account a=	printAccount( accno);
		
		
	}
	public Account AccountDetails(int accNo) throws InvalidAccountException {
		for(Account a :account) {
			if(a==null) 
				throw new InvalidAccountException("Account not found, Please check your account no"); 
			if(a.getAccno()!=accNo)
				throw new InvalidAccountException("Account not found, Please check your Account No."); 
			System.out.println(a); 
			return a;
		}
		return null;
	}
		private int search(int accno) {
			for(int i=0;i<op;i++) {
				if(account[i]==null)
					break;
				if(accno==account[i].getAccno())
					return i;
			}
			
			return -1;
		}
		public void depositAccount(int bal,int accno) throws InvalidAccountException {
			int accfound=search( accno);
			if(accfound<0)
				throw new InvalidAccountException("Accnt no not mstchyed");
				int oldbalance=account[accfound].getBalance();
				account[accfound].setBalance(oldbalance + bal);
			System.out.println(	"total amount is "+account[accfound].getBalance());
					
					
			// TODO Auto-generated method stub
			
		}
		
	
public void widAccount(int bal,int accno) throws InvalidAccountException {
	int accfound=search( accno);
	if(accfound<0)
		throw new InvalidAccountException("Accnt no not mstchyed");
		int oldbalance=account[accfound].getBalance();
		account[accfound].setBalance(oldbalance - bal);
	System.out.println(	"total amount is "+account[accfound].getBalance());
			
			
	// TODO Auto-generated method stub
	
}

}
	
	//Open Account
	
//	
//	public void closeAccount(int accNo) throws InvalidAccountException {
//		int accFound =searchAcct(accNo);
//		if(accFound <0)
//			throw new InvalidAccountException("Account No is not found,Please check your Account No.");
//		Account a = AccountDetails(accNo);
//		account[accFound]=null;
//		//return accFound;
//	}
//	//Search Account based on account no
//	private int searchAcct(int accno) {
//		for(int i=0;i<op;i++) {
//			if(account[i] == null) break;
//			if(accno == account[i].getAccno())
//				return i;
//		}
//		return -1;
//	}
//	//Print Account Details
//	public Account AccountDetails(int accNo) throws InvalidAccountException {
//		for(Account a :account) {
//			if(a==null) 
//				throw new InvalidAccountException("Account not found, Please check your account no"); 
//			if(a.getAccno()!=accNo)
//				throw new InvalidAccountException("Account not found, Please check your Account No."); 
//			return a;
//		}
//		return null;
//
//}}