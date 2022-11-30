import java.util.Scanner;

public class BCCI {
	 static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	
	  System.out.println("Enter the format to be played");
	  String format=sc.next();
	 Sports gameFormat=Format.getGameFormat(format);
gameFormat.play();
	}

}
