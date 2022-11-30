
public class Account {
	private String name;
	private int accno;
	private int balance;
	public Account(String name, int accno, int balance) {
		super();
		this.name = name;
		this.accno = accno;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", accno=" + accno + ", balance=" + balance + "]";
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
/}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	

		
	

}
