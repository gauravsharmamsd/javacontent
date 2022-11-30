import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
 
@XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ADDRESS")
public class Address {
	@XmlAttribute
int pin;
	@XmlAttribute
String city;
public Address(int pin, String city) {
	super();
	this.pin = pin;
	this.city = city;
}
Address(){
	
}
@Override
public String toString() {
	return "Address [pin=" + pin + ", city=" + city + "]";
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
}
