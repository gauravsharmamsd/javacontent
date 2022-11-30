package Student;

public class Student {
String name;
Address addr;
int id;
@Override
public String toString() {
	return "Student [name=" + name + ", addr=" + addr + ", id=" + id + "]";
}
public Student(String name, Address add1, int id) {
	super();
	this.name = name;
	this.addr = add1;
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddr() {
	return addr;
}
public void setAddr(Address addr) {
	this.addr = addr;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
}
