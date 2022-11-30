import java.util.Scanner;

public class BankFactory {

	public static Object getInstance(String abc) {
		if(abc.equals("HDFC"))
		return new HDFC();
		else if(abc.equals("AXIS"))
			return new AXIS();
		return null;
		
	}


}
