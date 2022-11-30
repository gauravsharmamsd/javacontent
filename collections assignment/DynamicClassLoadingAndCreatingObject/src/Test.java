import java.util.Scanner;


public class Test {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Scanner sc =new Scanner (System.in);

try {
	System.out.println("Enter class name to be");
	String name=sc.next();
	Class className=Class.forName(name);
	System.out.println(className.getName());
	Object o= (Object)className.newInstance();
	System.out.println(o);
	
	
		((Animal) o).run();
} catch (ClassNotFoundException e) {

	e.printStackTrace();
}

	}
	

}
