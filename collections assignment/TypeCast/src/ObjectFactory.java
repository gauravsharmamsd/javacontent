
public class ObjectFactory {

	public static Object createObject(String className) {
		if(className.equals("Employee"))
		return new Employee();
		else if(className.equals("Manager"))
			return new Manager();
		else if(className.equals("Developer"))
			return new Developer();
		else
		return null;
	}

}
