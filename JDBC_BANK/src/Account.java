
public class Account {

	private  String name;
	private  int balance;
	private  int accno;
	public Account(String name, int balance, int accno)throws InsufficientAmountException {
		super();
		this.name = name;
		this.balance = balance;
		this.accno = accno;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}




}
