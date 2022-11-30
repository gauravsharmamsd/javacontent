import java.util.Comparator;

public class sortByLname implements Comparator<Customers> {

	@Override
	public int compare(Customers o1, Customers o2) {
		
		return o1.fname .compareTo(o2.fname);
	}

}
