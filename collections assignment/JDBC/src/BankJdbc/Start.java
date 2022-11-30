//package BankJdbc;
//
//import java.sql.SQLException;
//import java.util.Scanner;
//
//public class Start {
//    static Scanner sc=new Scanner(System.in);
//	public static void main(String[] args) throws SQLException {
//		
//	System.out.println("welcome babe");
//	while (true) {
//		System.out.println("preass 1 to add student");
//		System.out.println("press 2  to delete student");
//		System.out.println("Display 3 student");
//		System.out.println("Exit");
//		int x =sc.nextInt();
//		switch(x) {
//		case 1: System.out.println("Enter acc name");
//		String name=sc.next();
//		 System.out.println("Enter user pin");
//		int pin=sc.nextInt();
//		 System.out.println("Enter user city");
//		String city=sc.next();
//		//
//		Account stud=new Account(name,pin,city);
////		System.out.println(stud);
//		boolean ans=Bank.InsertDetailsToDB(stud);
//		if(ans==true) {
//			System.out.println("Student goes to database");
//		}
//		else {
//			System.out.println("Something went wrong");
//		}
//		System.out.println(stud);
//		break;}}}}
//		