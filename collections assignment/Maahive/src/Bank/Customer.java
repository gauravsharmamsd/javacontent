package Bank;

public class Customer {
String firstname;
String lastname;
int balance;
String city;
int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Customer(String firstname, String lastname, int balance, String city, int id) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.balance = balance;
	this.city = city;
	this.id = id;
}

public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", balance=" + balance + ", city=" + city
			+ ", id=" + id + "]";
}
public Customer(String firstname, String lastname, int balance, String city) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.balance = balance;
	this.city = city;
}

}
