package Day1;

public class Players {
	private String fname;
	private String lname;
	private int age;
	private int Regamount;

	public Players() {
		super();
	}
	
	public Players(String fname,String lname, int age, int regamount) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		Regamount = regamount;
	}

public String getfname() {
	return fname;
}
public void setfname(String fname) {
	this.fname=fname;
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

	public int getRegamount() {
		return Regamount;
	}

	public void setRegamount(int regamount) {
		Regamount = regamount;
	}

	@Override
	public String toString() {
		return "Players [fname=" + fname + ", lname=" + lname + ", age=" + age + ", Regamount=" + Regamount + "]";
	}
	
	
	
	

}
