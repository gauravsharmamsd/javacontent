import java.util.Comparator;

public class sortByPin implements Comparator<Customers> {

	@Override
	public int compare(Customers o1, Customers o2) {
		// TODO Auto-generated method stub
		return o1.addr.pin -(o2.addr.pin);
	}

}
