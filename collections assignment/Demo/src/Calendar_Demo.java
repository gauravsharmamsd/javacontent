// Java code to illustrate
// getTime() method

import java.util.*;

public class Calendar_Demo {

	public static void main(String args[])
		throws InterruptedException
	{

		// Creating a calendar
		Calendar calndr1
			= Calendar.getInstance();


		Date d=calndr1.getTime();
		
		System.out.println("_________"+d);

		// Adding few delay
		Thread.sleep(10000);

		// Creating another calendar
		Calendar calndr2 = Calendar.getInstance();

		// Displaying the upcoming time
		Date dt = calndr2.getTime();
		System.out.println("The upcoming"
						+ " time is: " + dt);
	}
}
