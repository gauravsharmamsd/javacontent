package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Map <Student,Address> maps=new HashMap<>();
		Address addr1=new Address(1,"Melboune","Australia");
		Student c1=new Student(1,2,"Abbhi","Jain",addr1);
		
		Address addr2=new Address(2,"Sydney","Colombo");
		Student c2=new Student(7,5,"Abhi","Khan",addr2);
		
		Address addr3=new Address(1,"Noida","India");
		Student c3=new Student(111,9,"Alipaksh","Khan",addr3);
		//System.out.println();
		maps.put(c1,addr1);
		maps.put(c3, addr3);
		maps.put(c2, addr2);
		System.out.println(">.................."+c1.getFname());
		System.out.println("________________________________________________");
		Set<Student>s=maps.keySet();{
		for(Student s1: s)
			System.out.println(s1);
		}
		System.out.println("-------------------bycity............");
		Map <Student,Address> map1=new TreeMap<>(new sortByCity());
		map1.putAll(maps);
		Set<Student>st=map1.keySet();{
			for(Student stu: st)
				System.out.println(stu);
			}

	}

}
