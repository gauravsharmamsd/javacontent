package Day3;

import java.util.Scanner;

import Day1.Animal;

public class Driver {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException  {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter vehicle name");
//		String someVehicleName=sc.nextLine();
		Class c= Class.forName(args[0]);
		
		Vehicle obj =(Vehicle)c.newInstance();
		drive(obj);
		// TODO Auto-generated method stub

	}

	private static void drive(Vehicle obj ) {
		obj.accelerate(30);
	obj.accelerate(25);
		// TODO Auto-generated method stub
		
	}

}
