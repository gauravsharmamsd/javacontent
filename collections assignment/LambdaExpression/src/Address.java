
public class Address {
String city;
int pin;
Address(String city ,int pin){
	this.city=city;
	this.pin=pin;
}
public Address() {
	// TODO Auto-generated constructor stub
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
@Override
public String toString() {
	return "Address [city=" + city + ", pin=" + pin + "]";
}

}
