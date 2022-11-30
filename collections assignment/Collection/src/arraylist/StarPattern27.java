package arraylist;

import java.util.Scanner;

public class StarPattern27 {



	public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enetr tbjkhe no you want to print");
	int n= sc.nextInt();
	
	for(int i=1;i<=n;i++) {
		for(int k=2;k<=i;k++) {
			System.out.print(" ");
		}
		for(int j=n;j>=i;j--) {
			
			if( j==n)
			System.out.print("*");
			else
				System.out.print(" ");	
		}
		System.out.println();
	}
	for(int i=1;i<=n;i++) {
		for(int j=n;j>=i;j--) {
			if( j==i)
			System.out.print("*");
			else
				System.out.print(" ");	
		}
		System.out.println();
	}
}
}

