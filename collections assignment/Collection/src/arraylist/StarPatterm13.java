package arraylist;

import java.util.Scanner;

public class StarPatterm13 {


	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter he no ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

}

}