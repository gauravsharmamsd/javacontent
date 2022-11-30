package basicsOfArray;

public class Student {
	private String name;
	private int id;
	void setNameandAge(String Name,int ID) {
		this.name=Name;
		this.id=ID;
	}
void introduce() {
	System.out.println(name+""+id);
}
public void setName(String abc) {
	this.name=abc;
	// TODO Auto-generated method stub
	
}
public String getName() {
	return name;
	
}
public void setID(int i) {
	this.id=i;
	// TODO Auto-generated method stub
	
}
public int getID() {
	return id;
}
@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + "]";
}

}
