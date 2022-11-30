package BankApp;

import java.util.Scanner;

public class Main {
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		ui();
	}

	private static void ui() {
		System.out.println("Welcome to bank");
		
		while(true) {
			System.out.println("Enter your choice....");
			int x=sc.nextInt();
			switch(x) {
			case 1:
				System.out.println(" Open Account");
				OpenAccountThread ot=new OpenAccountThread();
				Thread t1=new Thread(ot);
				t1.start();
				break;
			case 2:
				System.out.println(" close Account");
				break;
			}
		}
	}

}
