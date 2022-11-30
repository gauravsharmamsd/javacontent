package basicsOfArray;

import java.util.Scanner;

public class Test {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) {
		
	Student s[]=new Student[3];
Student s1=new Student();
Student s2=new Student();
s1.setNameandAge("bhdbkja",5);
s[0]=s1;
String name=sc.next();
s2.setName(name);
int x=sc.nextInt();
s2.setID(x);
s[1]=s2;
for(int i=0;i<2;i++) {
System.out.println(s[i].toString());
}}}
