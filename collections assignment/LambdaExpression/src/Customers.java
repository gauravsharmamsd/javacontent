
public class Customers {

String fname;
String lname;
Addresss addr;
int id;

public Customers(String fname, String lname, Addresss addr, int id) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.addr = addr;
	this.id = id;
}

@Override
public String toString() {
	return "Customers [fname=" + fname + ", lname=" + lname + ", addr=" + addr + ", id=" + id + "]";
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public Addresss getAddr() {
	return addr;
}
public void setAddr(Addresss addr) {
	this.addr = addr;
}


@Override 
public boolean equals(Object o) {
	Customers ss=(Customers)o;
	return (ss.id==this.id)&& (ss.fname==this.fname);
	
	
}
@Override
public int hashCode() {

	return this.addr.pin;
}
}

