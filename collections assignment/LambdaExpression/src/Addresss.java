
public class Addresss {
int pin;
String city;
public Addresss() {
	super();
}
public Addresss(int pin, String city) {
	super();
	this.pin = pin;
	this.city = city;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Addresss [pin=" + pin + ", city=" + city + "]";
}}

