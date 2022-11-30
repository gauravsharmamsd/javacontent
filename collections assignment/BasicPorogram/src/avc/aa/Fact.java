package avc.aa;

import java.util.Scanner;


public class Fact {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
	int n=sc.nextInt();
int r=Fact.fact(n);
System.out.println(r);
		}
	public static int fact(int n) {
		if(n<1) {
			return 1;
		}
		else 
		return	n*fact(n-1);
		
	}
}


