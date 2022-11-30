package methodOverloading;

public class Gaurav {
private  String fname;
private  String lname;
private  int roll;
private  int pin;
public Gaurav(String fname, String lname, int roll, int pin) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.roll = roll;
	this.pin = pin;
	
}
public Gaurav() {
	// TODO Auto-generated constructor stub
}
public String getFname() {
	return fname;
}
public void setFname(String string) {
	this.fname = string;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
@Override
public String toString() {
	return "Gaurav [fname=" + fname + ", lname=" + lname + ", roll=" + roll + ", pin=" + pin + "]";
}
}

