import java.util.Comparator;

public class fname implements Comparator <Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		
		return o1.fname. compareTo(o2.fname);
	}

}
