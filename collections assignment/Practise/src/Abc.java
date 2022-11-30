class A{
	A(){
		System.out.println("A constructor called");
	}
	class B{
		B(){
			System.out.println("B constructor called");
		}
	}
}
public class Abc {


 
	
	
	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class c =Class.forName(args[0]);
		Object o=c.newInstance();
//	System.out.println(args[0]);
//	System.out.println(args[1]);
}



}
