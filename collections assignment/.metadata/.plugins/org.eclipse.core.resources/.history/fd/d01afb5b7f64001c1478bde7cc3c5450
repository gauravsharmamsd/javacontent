package bankingProject;

//import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBankProject {
	Bank b=new Bank();
	@Test
	void testcloseBankWithToCloseAccount() throws InvalidAccountException {
	//	b.closeAccount(2);
	Throwable t=assertThrows(InvalidAccountException.class,()->b.closeAccount(154));
		
	}
	void testcbanktpenAcc() throws InvalidAccountException {
		//	b.closeAccount(2);
		Throwable t=assertThrows(InsufficientAmountException.class,()->b.openAccount("anil", 12));
			
		}
	void testcbankdeposit() throws InvalidAccountException {
		//	b.closeAccount(2);
		Throwable t=assertThrows(InsufficientAmountException.class,()->b.deposit(1000, 0));
			
		}
	void testcbankwithdrw() throws InvalidAccountException {
		//	b.closeAccount(2);
		Throwable t=assertThrows(InsufficientAmountException.class,()->b.withdraw(100000000, 9));
			
		}
	void testAccountDetails() throws InsufficientAmountException, InvalidAccountException {
		Bank b=new Bank();
		int accno=b.openAccount("maahi", 2000);
		Account ac=b.AccountDetails(accno);
		assertEquals(accno,ac.getAccno());
		assertEquals("maahi",ac.getName());
		
	}
	
	

}
