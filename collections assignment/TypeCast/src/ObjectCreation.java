
public class ObjectCreation {

	public static Object get(String abc) {
		if(abc.equals("square"))
		return new square();
		if(abc.equals("Trapezoid"))
			return new Trapezoid();
			
		else if(abc.equals("Rectangle"))
			return new Rectangle();
		return null;
		
	}


}
