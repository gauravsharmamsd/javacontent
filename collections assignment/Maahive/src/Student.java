
public class Student {
String name;
String phone;
String city;
int id;
 public Student(){
	
}
public Student(String name, String phone, String city) {
	super();
	this.name = name;
	this.phone = phone;
	this.city = city;
}
@Override
public String toString() {
	return "Student [name=" + name + ", phone=" + phone + ", city=" + city + ", id=" + id + "]";
}
public Student(String name, String phone, String city, int id) {
	super();
	this.name = name;
	this.phone = phone;
	this.city = city;
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}
