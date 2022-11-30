import java.util.Comparator;

public class sortByCity implements Comparator<Customers> {

	
	@Override
	public int compare(Customers o1, Customers o2) {
		// TODO Auto-generated method stub
		return o1.addr.city.compareTo(o2.addr.city);
	}

}
