import java.util.Comparator;

public class city implements Comparator<Student1> {

	@Override
	public int compare(Student1 o1, Student1 o2) {
		
		return o1.city.compareTo(o2.city);
	}

}
