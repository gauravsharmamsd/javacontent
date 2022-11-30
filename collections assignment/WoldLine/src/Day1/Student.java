package Day1;


import java.util.Scanner;
 
public class Student{
  @Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + ", age=" + age + ", city=" + city + ", country="
				+ country + ", pin=" + pin + "]";
	}

private String fname;
  private String lname;
  private int age;
  private String city;
  private String country; 
  private int pin;
  public Student() {
	  super();
  }
  
  public Student( String fname, String lname,int age,String city,String country,int pin){
    super();
    this.fname = fname;
    this.lname = lname;
    this.age=age;
        this.city = city;
        this.country=country;
    this.pin = pin;
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

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public int getPin() {
	return pin;
}

public void setPin(int pin) {
	this.pin = pin;
}


    
  
  
 
}



