
public class StudentWithAddress {
	private String fname;
	private String lname;
	private int age;
	private Address address;
	
	
	public StudentWithAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentWithAddress(String fname, String lname, int age, Address addr) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.address = addr;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentWithAddress [fname=" + fname + ", lname=" + lname + ", age=" + age + ", address=" + address
				+ "]";
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
