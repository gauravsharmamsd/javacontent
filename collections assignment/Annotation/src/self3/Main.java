package self3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	 Scanner sc=new Scanner(System.in);
		while (true) {
		String sport=sc.next();
		Sports sports=SportsFactory.GetSports(sport);
	
//sports.play();
		}
	}

}
