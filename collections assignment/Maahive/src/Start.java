import java.sql.SQLException;
import java.util.Scanner;

public class Start {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws SQLException {
		
	System.out.println("welcome babe");
	while (true) {
		System.out.println("preass 1 to add student");
		System.out.println("press 2  to delete student");
		System.out.println("Display 3 student");
		System.out.println("Exit");
		int x =sc.nextInt();
		switch(x) {
		case 1: System.out.println("Enter user name");
		String name=sc.next();
		 System.out.println("Enter user phone");
		String phone=sc.next();
		 System.out.println("Enter user city");
		String city=sc.next();
		//
		Student stud=new Student(name,phone,city);
		boolean ans=StudentDemo.InsertStudentToDB(stud);
		if(ans==true) {
			System.out.println("Student goes to database");
		}
		else {
			System.out.println("Something went wrong");
		}
		System.out.println(stud);
		break;
		case 2:
			System.out.println("Enter user uid which is to be deleted");
			int y=sc.nextInt();
		boolean ans1=	StudentDemo.deleteStudent(y);
		if(ans1==true) {
			System.out.println("Deleted");
		}
		else {
			System.out.println("opops..............u failed");
		}
break;
		case 3:
			System.out.println("Enter to show the  deatils");
			
		StudentDemo.showAll();
		
	
break;
		}
	}
	}

}
