package map;

import java.util.Comparator;

public class sortByCity implements Comparator <Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.address.getCity().compareTo(o2.address.getCity());
	}

}
