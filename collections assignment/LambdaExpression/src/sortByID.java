import java.util.Comparator;

public class sortByID implements Comparator<Customers> {

	@Override
	public int compare(Customers o1, Customers o2) {
				return o1.id-o2.id;
	}

}
