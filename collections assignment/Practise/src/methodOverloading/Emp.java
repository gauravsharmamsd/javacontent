package methodOverloading;

public class Emp {
	private static int eid;
	private static String Ename;

public Emp(int eid,String Ename) {
	this.eid=eid;
	this.Ename=Ename;
}
public Emp() {
	// TODO Auto-generated constructor stub
}
public int geteid() {
	return eid;
}
public void seteid(int eid) {
	this.eid=eid;
	
}
public int getEname() {
	return eid;
}
public void setEname(String ename) {
	this.Ename=ename;
	System.out.println(Ename);
	
}
public String toString() {
	return "Empl["+Ename+" "+eid+"]";
}
}