package methodOverloading;
import java .util.*;
public class Test
{private static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) {
    hardCodedDetails();
    softCodeDetails();
    }
private static void softCodeDetails() {
	System.out.println("Enetr the no Index");
		int n=sc.nextInt();
		Gaurav g[]=new Gaurav[n];
		for(int i=0;i<n;i++) {
			Gaurav g1=new Gaurav();
			System.out.println("Enetr the fname");
			String fname=sc.next();
			g1.setFname(fname);
			System.out.println("Enetr the lname");
			String lname=sc.next();
			g1.setLname(lname);
			System.out.println("Enetr the pin");
			int pin=sc.nextInt();
			g1.setPin(pin);
			System.out.println("Enetr the roll");
			int roll=sc.nextInt();
			g1.setRoll(roll);
			g[i]=g1;
		}
			printStudents(g);
			
		
		
	
	
	
	
}
	private static void hardCodedDetails() {
		Gaurav s[]=new Gaurav[3];
		Gaurav s1=new Gaurav();
		s1.setFname("abc");
		s1.setLname("def");
		s1.setPin(0);
		s1.setRoll(15);
		s[0]=s1;
		Gaurav s2=new Gaurav();
		s2.setFname("xyx");
		s2.setLname("khk");
		s2.setPin(0000);
		s2.setRoll(15000);
		s[1]=s2;
		Gaurav s3=new Gaurav("xyz","avc",76,65);
		s[2]=s3;
		printStudents(s);
	}

	private static void printStudents(Gaurav[] m) {
		for(Gaurav g: m) {
			System.out.println(g);
		// TODO Auto-generated method stub
		
	}
		
		
		
		
		// TODO Auto-generated method stub
		
	}
    
    }

	