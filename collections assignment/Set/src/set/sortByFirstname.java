package set;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class sortByFirstname implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getFname().compareTo(o2.getFname());
	}
}
	