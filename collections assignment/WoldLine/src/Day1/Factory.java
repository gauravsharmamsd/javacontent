package Day1;

import java.util.*;

class Factory{
	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Scanner sc = new Scanner(System.in);
	//	String whatclass=sc.nextLine();
		
		Class c=Class.forName(args[0]);
		Object obj=c.newInstance();
	}}
class X{
	X(){
		System.out.println("W are one");
	}
}
class Y{
	Y(){
		System.out.println("W are not one");
	}
}
