

import java.util.Scanner;

public class Act {
private String name;
private int id;
private int balance;
static Scanner sc =new Scanner(System.in);
public Act(String name, int id, int balance) {
	super();
	this.name = name;
	this.id = id;
	this.balance = balance;
}
public Act() {
	// TODO Auto-generated constructor stub
}
public String openAccount() throws ThresHoldException {
	System.out.println("name of applicant");
	 name=sc.next();
	 System.out.println("id allote by customer");
 id=sc.nextInt();
 System.out.println("Account opening bal");
 balance=sc.nextInt();
 if(balance<1000) {
	 throw new ThresHoldException("min 1000 can open");
 }
// if(id)
return "name"+name+" "+"id--"+ "   "+id +" "+"bal--"+" "+balance;
}
 
public void closeAccount() throws InvalidAccountException {
int id=sc.nextInt();
if(id!=this.id) 
	throw new InvalidAccountException("not an valid id");
	else
	System.out.println("Account succesfully close");

}
	

public void deposit(int amount) throws InvalidIdException {
	System.out.println("enter customer id");
	int id=sc.nextInt();
	
	if(id!=this.id)
		throw new InvalidIdException("Id is not valid to add amount");
	balance=balance+amount;
	System.out.println(balance);
		// TODO Auto-generated method stub
	
}
public void withdrawl(int amount) throws LowBalanceException{
	if(balance>amount)
		throw new LowBalanceException("sorry Inssufficient Balance");
	balance=balance-amount;
	System.out.println(balance);
		// TODO Auto-generated method stub
	
}


}
