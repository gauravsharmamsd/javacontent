package StudentInfo;

import java.util.Scanner;

import Day1.Student;

public class Test {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		hardCodedData();
		// TODO Auto-generated method stub

	}

	private static void hardCodedData() {
System.out.println("Enetr the no of Students");
int n=sc.nextInt();
Student [] students=new Student[n];
for(int i=0;i<n;i++) {
Student s=new Student();

System.out.println("Enetr the first name");
String fnmae=sc.next();
s.setFnmae(fnmae);


System.out.println("Enetr the last name");
String lnmae=sc.next();
s.setLnmae(lnmae);


System.out.println("Enetr the lroll");
int  roll=sc.nextInt();
s.setRoll(roll);
System.out.println("Enetr the pin");
int  pin=sc.nextInt();
s.setPin(pin);

students[i]=s;
	} 
	printStudents(students);
		




	}
	private static void printStudents(Student[] jgj) {
		for(Student s: jgj) {
			System.out.println(s);
		}
		

		// TODO Auto-generated method stub
		
	}

}
