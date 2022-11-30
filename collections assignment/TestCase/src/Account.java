
public class Account {// class with name as Account,public is a access Specifier
	String name; //property with string typ
	int accno;// properties with int typ
	int balance;//properties with int typ;
	public Account(String name, int accno, int balance) {//constructor -having parameter
		//super(); // used to refer Account class instance variable
		this.name = name;// this-used to refer Account class instance variable
		this.accno = accno;// Initilaizing the proprty of Account class with passed Arguement
		this.balance = balance;// same
	}
	public Account() {// NOn parametrized Constructor
		// TODO Auto-generated constructor stub
	}
	public String getName() { // getMethod 
		return name; // returning String type
	}
	public void setName(String name) { //set method of type void,having a passing parameter of type String 
		this.name = name;// this -refer Account class variable,initailaize the name prop of Acount class with passed arg
	}
	public int getAccno() {//getMethod returning int typ
		return accno; //returning int type
	}
	public void setAccno(int accno) {////set method of type void,having a passing parameter of type int 
		this.accno = accno;//this -refer Account class variable,initailaize the name prop of Acount class with passed arg
	}
	public int getBalance() {// get method returning int typ
		return balance;// returning 
	}
	public void setBalance(int balance) {////set method of type void,having a passing parameter of type int 
		this.balance = balance;//this -refer Account class variable,initailaize the balance prop of Acount class with passed arg
	}
	
	

}
