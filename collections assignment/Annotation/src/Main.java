

import java.util.Scanner;

import self3.SportsFactory;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Scanner sc =new Scanner(System.in);
		String sportsName=sc.next();
		Sports sport=SportFactory.getObject(sportsName);
//sport.Play();
	}

}
//