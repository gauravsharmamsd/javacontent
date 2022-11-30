package BankJdbc;

public class Account  {
	String acname;
	int pin;
	String city;
	int amount;

	@Override
	public String toString() {
		return "Account [acname=" + acname + ", pin=" + pin + ", city=" + city + ", amount=" + amount + "]";
	}
	public Account(String acname, int pin, String city,int amount) {
		super();
		this.acname = acname;
		this.pin = pin;
		this.city = city;
		this.amount=amount;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public String getAcname() {
		return acname;
	}
	public void setAcname(String acname) {
		this.acname = acname;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
