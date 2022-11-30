package Student;

public class Address {
String city;
int pincode;
int id;
public Address(String city, int pincode, int id) {
	super();
	this.city = city;
	this.pincode = pincode;
	this.id = id;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public Address(String city, int pincode) {
	super();
	this.city = city;
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [city=" + city + ", pincode=" + pincode + ", id=" + id + "]";
}

}
