package set;

public class Student {
private int rollNo;
private int std;
private String fname;
private String lname;
Address address;
public Student(int rollNo, int std, String fname, String lname, Address address) {
	super();
	this.rollNo = rollNo;
	this.std = std;
	this.fname = fname;
	this.lname = lname;
	this.address = address;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public int getStd() {
	return std;
}
public void setStd(int std) {
	this.std = std;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", std=" + std + ", fname=" + fname + ", lname=" + lname + ", address="
			+ address + "]";
}
Student(){
	
}
@Override
public boolean equals(Object o) {
	Student str=(Student) o;
	return this.fname.equals(str.fname);
}
@Override
public int hashCode() {
	return 5;
	
}


}
