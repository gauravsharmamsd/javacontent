package Bank;

public class Account {
String Acctname;
int bal;
String city;
int accNo;
public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}

public Account(int amt,String name, String city) {
	this.Acctname =name;
	this.bal = amt;
	this.city = city;
this.accNo=accNo;
}
public String getAcctname() {
	return Acctname;
}
public void setAcctname(String acctname) {
	Acctname = acctname;
}
public int getBal() {
	return bal;
}
public void setBal(int bal) {
	this.bal = bal;
}
public String getCity() {
	return city;
}
@Override
public String toString() {
	return "Account [Acctname=" + Acctname + ", bal=" + bal + ", city=" + city + ", accNo=" + accNo + "]";
}
public void setCity(String city) {
	this.city = city;
}
}
