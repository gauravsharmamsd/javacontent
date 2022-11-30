import java.util.*;

public class Student {
	String fname;
	String lname;

	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + "]";
	}
	public Student(String fname, String lname) {
		this.fname=fname;
		this.lname=lname;
	}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return Objects.equals(fname, other.fname) && Objects.equals(lname, other.lname);
}
@Override
public int hashCode() {
	System.out.println("The hashcode for first name  "  +fname.hashCode());
	System.out.println("The hashcode for last name  "+lname.hashCode());
	
	return Objects.hash(fname, lname);
}
	
	
	public static void main(String[] args) {
		Set<Student> s=new HashSet();
	Student  s1=new Student("A1","B");
	Student  s2=new Student("x","Y");
	Student  s3=new Student("A1","B");
	boolean result =s1.equals(s2);
	System.out.println("Is s1& s2 equal ? "+result);
	boolean result1 =s2.equals(s3);
	System.out.println("Is s2& s3 equal ?"+result1);
	boolean result11 =s1.equals(s3);
	System.out.println("Is s1& s3 equal ?"+result11);
	
	s.add(s1);
	s.add(s2);
	s.add(s3);
	//ForEnhanced
	System.out.println("For each method----------");
	System.out.println();
	for(Student stud:s)
System.out.println(stud);
	//Iterator
	System.out.println("Iterator method----------");
	System.out.println();
	Iterator itr=s.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
	}

}
