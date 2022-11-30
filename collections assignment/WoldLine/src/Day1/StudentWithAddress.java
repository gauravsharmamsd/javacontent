package Day1;

public class StudentWithAddress {
private String fname;
private String lname;
private int age;
private Address address;
public StudentWithAddress() {
	super();
}
public StudentWithAddress(String fname, String lname, int age, Address address) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.age = age;
	this.address = address;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "StudentWithAddress [fname=" + fname + ", lname=" + lname + ", age=" + age + ", address=" + address + "]";
}

}
