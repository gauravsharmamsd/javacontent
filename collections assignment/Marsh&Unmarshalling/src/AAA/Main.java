package AAA;



import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	
	Address add=new Address(111,"up","Delhi");
Student s=new Student("Aklu","kumar",22,11,add);
List<Student>l=new ArrayList<Student>();
l.add(s);
  System.out.println(l);
}}
