import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Car{
static String color;
 static String make;
 static String model;
 static int engineCapacity;
 static int noOfDoor;
 static float weight;
 static float volume;
 @Override
 public String toString() {
 	return "Car1 [color=" + color + ", make=" + make + ", model=" + model + ", engineCapacity=" + engineCapacity
 			+ ", noOfDoor=" + noOfDoor + ", weight=" + weight + ", volume=" + volume + "]";
 }


public Car(String color, String make, String model, int engineCapacity, int noOfDoor, float weight, float volume) {
	super();
	this.color = color;
	this.make = make;
	this.model = model;
	this.engineCapacity = engineCapacity;
	this.noOfDoor = noOfDoor;
	this.weight = weight;
	this.volume = volume;
}
@Override
public boolean equals(Object obj) {
	
	if(obj instanceof Car) { 
	Car other = (Car) obj;
if(other.engineCapacity==this.engineCapacity  && other.color.equals(this.color)){
	return true;
}
return false;
}
return true;
}
@Override
public int hashCode() {
	
return color.hashCode();
//return engineCapacity.hashCode();
}
	
	
	public static void main(String[] args) {
		Set<Car> s=new HashSet();
		
	Car car1 =new Car("Black", "TATA", "2007", 720, 4, 1520f, 1000);
	s.add(car1);
	System.out.println("---------"+car1.hashCode());
	System.out.println(s.size());
	Car car2 =new Car("Blue", "Yamaha", "2013",7120, 6, 15220f, 1050);
		boolean is=s.add(car2);
		System.out.println("---------"+car2.hashCode());
		System.out.println(is);
		System.out.println(s.size());

	
}
}