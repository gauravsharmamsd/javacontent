package avc.aa;

import java.util.Scanner;

public class Revrse {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" enter the no you want to reverrse ");
	int n= sc.nextInt();
		int rev=0;
	while(n!=0) {
	int temp=n%10;
	rev=rev*10+ temp;
	n=n/10;
	}
	System.out.println("the revrrerse of the no is " +rev);
	}

}
