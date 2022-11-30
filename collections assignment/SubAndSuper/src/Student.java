
public class Student {
private String fname;
private int sid;
Student(String fname,int sid){
	this.sid=sid;
	this.fname=fname;
	
}
public Student() {
	// TODO Auto-generated constructor stub
}
public void setName(String fname) {
	this.fname=fname;
	// TODO Auto-generated method stub
	
}
public String getName() {
	return fname;
}
@Override
public String toString() {
	return "Student [fname=" + fname + ", sid=" + sid + "]";
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}



}
