
public class Student {
	private String fname;
	private String lname;
	private int age;
	private String city;
	private String country;
	private int pin;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String fname, String lname, int age, String city, String country, int pin) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.city = city;
		this.country = country;
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

	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + ", age=" + age + ", city=" + city + ", country="
				+ country + ", pin=" + pin + "]";
	}
	
	

}




//MUST FOLLOW Naming conventions .
//Class Name Must have first Word allLowerCase
//Class name should generally be one single word
//Class name is supposed to be a noun
//Constants are supposed to be all UPPER CASE with "_" as word delimiter
//e.g. MAX_LIMIT
//variables must always be lower case preferrebly single word
//but if variable contains more than word then first word should always be lower case
//Same for method Names(Second word in method should start with Upper case)//e.g.
//calculateInterest
//Method name must be a verb 99% you will follow this some rare cases method names are nouns
//Indentation : 4 spaces
