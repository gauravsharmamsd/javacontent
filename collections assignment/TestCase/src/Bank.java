
public class Bank { //  Bank is a class name here,having Access modifier As public,can be accesed from anywhr
private	Account acct; // property of Bank class
//private Account acct;
public int withdraw(int amount) { //called method with arguement
	
	int balance=acct.getBalance(); //Initializing variable ,with what we are getting from getBal.method off act.class
	acct.setBalance(balance-amount);// calling accnt class method i.e setBalance(having a parameter of int typ)
	return acct.getBalance();// returning the rezult get from getBalance method of account class
}
public int deposit(int amount) {// //called method with arguement having Access modifier As public i.e can be accesed from anywhr
	//acct.setBalance(1500);
	int balance=acct.getBalance();//Initializing variable ,with what we are getting from getBal.method off act.class
	acct.setBalance(balance+amount);//calling accnt class method i.e setBalance(having a parameter of int typ)
	return acct.getBalance();//returning the rezult get from getBalance method of account class
}
public Account getAccount() {// method
	
	return this.acct;
}
public void setAccount(Account acct) {//setter method,taking parametr as int typ
	 this.acct=acct; //initilaze the property with passed parameter
	// TODO Auto-generated method stub
	
}
}
