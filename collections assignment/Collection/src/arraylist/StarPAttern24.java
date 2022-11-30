package arraylist;

import java.util.Scanner;

public class StarPAttern24 {

public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enetr the number youy want to print");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=n-1;j>=i;j--) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			if(j==1|| j==i) {
			System.out.print("*");
		}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
}
	for(int i=2;i<=n;i++) {
		for(int j=2;j<=i;j++) {
			System.out.print(" ");
		}
		for(int k=n;k>=i;k--)
		{
			if(k==i || k==n ) {
			System.out.print("*");
			}
			else {

				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	}
}