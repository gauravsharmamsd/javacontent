package arraylist;

import java.util.Scanner;

public class StarPattern20 {

public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enetr the no youy want to print");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j =n-1;j>=i;j--) {
			System.out.print(" ");
		}
		for(int j=1;j<=2*i-1;j++) {
			if( i==n || j==2*n-1 || j==1 || j==2*i-1) {
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
