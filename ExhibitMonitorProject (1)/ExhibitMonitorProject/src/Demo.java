import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Demo {
	public static void main(String[] args) throws FileNotFoundException {
		// Java code to illustrate
		// getTime() method

		import java.util.*;

		public class Demo {
			
		

			public static void main(String args[])
				throws InterruptedException
			{

				// Creating a calendar
				Calendar calndr1
					= Calendar.getInstance();

				// Displaying the current time
				System.out.println("The Current"
								+ " Time is: "
								+ calndr1.getTime());

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
