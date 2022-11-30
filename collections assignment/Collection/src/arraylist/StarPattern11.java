package arraylist;

import java.util.Scanner;

public class StarPattern11 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter he no ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int l=1;l<=i;l++) {
				System.out.print("*");
	}
			for(int m=n-1;m>=i;m--) {
				System.out.print("*");
			}
System.out.println("");
		}
	
}
	}


		
	
