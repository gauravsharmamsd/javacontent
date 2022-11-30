package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set set1 = new HashSet();
		Address addr1 = new Address(2, "Hapur", "India");
		Student stud1 = new Student(1, 2, "Rahul", "Kaushik", addr1);

		Address addr2 = new Address(4, "Noida", "UK");
		Student stud2 = new Student(1, 2, "Gaurav", "Sharma", addr2);

		Address addr3 = new Address(14, "GautamBuddh", "Newzealand");
		Student stud3 = new Student(1, 2, "Monu", "Sharma", addr3);

		set1.add(stud3);
		set1.add(stud2);
		set1.add(stud1);

		System.out.println("_________________________firstname_____________");
		Set set2 = new TreeSet(new sortByFirstname());
		set2.addAll(set1);
		System.out.println(set2);

		System.out.println("_____________________________pin__________________");
		Set set3 = new TreeSet(new sortByPinname());
		set3.addAll(set1);
		System.out.println(set3);

	}

}
