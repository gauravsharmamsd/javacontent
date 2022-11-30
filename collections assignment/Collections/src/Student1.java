
public class Student1 implements Comparable<Student1> {
String fname;
String lname;
String city;
String Country;
int age;
@Override
public String toString() {
	return "StudentTree [fname=" + fname + ", lname=" + lname + ", city=" + city + ", Country=" + Country + ", age="
			+ age + "]";
}
public Student1(String fname, String lname, String city, String country, int age) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.city = city;
	Country = country;
	this.age = age;
}

@Override
public int compareTo(Student1 o) {
	if(this.age==o.age) {
		return 0;
	}
	return this.age-o.age;
	
	
}
}
