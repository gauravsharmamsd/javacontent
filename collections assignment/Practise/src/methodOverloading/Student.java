package methodOverloading;

public class Student {
private String fname;
private String lname;
private String city;
private int roll ;
private int pin;


public Student(String fname,String lname,String city,int roll,int pin){
	this.fname=fname;
	this.lname=lname;
	this.city=city;
	this.roll=roll;
	this.pin=pin;
}@Override
public String toString() {
	return "Student [" + fname + ","+lname+","+city+","+roll+","+pin+"]";
}
    
  }

