package set;

import java.util.Comparator;

public class sortByPinname implements Comparator <Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.address.getPin()-o2.address.getPin();
		
	}

}
