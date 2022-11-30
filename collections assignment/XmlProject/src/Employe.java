import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Emp")
public class Employe {
private int empNo;
private String ename;
private double Salary;
private Departmentment dept;
public int getEmpNo() {
	return empNo;
}
public void setEmpNo(int empNo) {
	this.empNo = empNo;
}
public Departmentment getDept() {
	return dept;
}
public void setDept(Departmentment dept) {
	this.dept = dept;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getSalary() {
	return Salary;
}
public void setSalary(double salary) {
	Salary = salary;
}
public Employe(int empNo, String ename, double salary) {
	super();
	this.empNo = empNo;
	this.ename = ename;
	Salary = salary;
}

@Override
public String toString() {
	return "Employe [empNo=" + empNo + ", ename=" + ename + ", Salary=" + Salary + ", dept=" + dept + "]";
}
public Employe() {
	// TODO Auto-generated constructor stub
}

}
