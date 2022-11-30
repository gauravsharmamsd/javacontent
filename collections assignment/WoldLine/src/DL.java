


import java.util.*;

	class A{
		A(){
			System.out.println("fhmygj");
		}
	}
	class B extends A{
		B(){
			System.out.println("fjmyi.k");
		}
	}
	
	public class DL {
	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	
	Class c= Class.forName(args[0]);
	
	Object obj=c.newInstance();
	//((Animal)obj).run();
	
	}}




