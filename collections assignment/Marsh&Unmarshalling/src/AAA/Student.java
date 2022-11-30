package AAA;





public class Student {
String fname;
String lname;
int age;
int rollNo;
Address add;
Student(){
	
}
public Student(String fname, String lname, int age, int rollNo, Address add) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.age = age;
	this.rollNo = rollNo;
	this.add = add;
}
@Override
public String toString() {
	return "Student [fname=" + fname + ", lname=" + lname + ", age=" + age + ", rollNo=" + rollNo + "]";
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
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
}
