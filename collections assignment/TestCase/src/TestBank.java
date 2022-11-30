import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBank {// class name as TestBank

	@Test
	void testGetAccount() {//method of type void of TestBank class
		Bank b=new Bank(); //bank is a class ,b is reference var,new is a kyword top create object,Bank() is a constructor---objectionCreation  of BANK CLASS//caling objectConstructor
		Account acct=new Account();// Creating object of Accopunt Class
		acct.setName("Gaurav");// call Methods
		acct.setAccno(12345);
		acct.setBalance(1000);
		
		b.setAccount(acct);////calling method of bank Object,with passing parameter of typ int
		Account acct2=b.getAccount();//calling method of bank Object,and initialize the giuven variable with returned rezult of method
		assertEquals(acct,acct2); //merhod of assertion calss,taking actual and expected arg,and checkn if equal
	}
	@Test
	void testGetWithdraw() {//method of type void of TestBank class
		Bank b=new Bank();//bank is a class ,b is reference var,new is a kyword top create object,Bank() is a constructor---objectionCreation  of BANK CLASS//caling objectConstructor
		
		Account acct=new Account("gaurav",1,2000);// Creating object of Accopunt Class//Calling paramertized Constructor
		b.setAccount(acct);////calling method of bank Object,with passing parameter of typ int
		int balance=b.withdraw(500);//calling method of bank Object,and initialize the giuven variable with returned rezult of method
				assertEquals(1500,acct.getBalance());//Method of assertion calss,taking actual and expected arg,and checkn if equal
	}
	@Test
	void testDeposit() {//method of type void of TestBank class
		Bank b=new Bank();////bank is a class ,b is reference var,new is a kyword top create object,Bank() is a constructor---objectionCreation  of BANK CLASS//caling objectConstructor
		Account acct=new Account("Kaushik",1,2000);//// Creating object of Accopunt Class//Calling paramertized Constructor
		b.setAccount(acct);//calling method of bank Object,with passing parameter of typ int
		int balance=b.deposit(1000);//calling method of bank Object,and initialize the giuven variable with returned rezult of method
		assertEquals(3000,acct.getBalance());//Method of assertion calss,taking actual and expected arg,and checkn if equal
		
		//fail("Not yet implemented");;
	}

}
