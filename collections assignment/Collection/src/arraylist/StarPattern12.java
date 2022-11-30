package arraylist;

import java.util.Scanner;

public class StarPattern12 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter he no ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=2;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--) {
				System.out.print("*");
			}
			for(int m=2;m<=i;m++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
}
}