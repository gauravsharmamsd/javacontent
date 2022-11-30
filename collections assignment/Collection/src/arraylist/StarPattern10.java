package arraylist;

import java.util.Scanner;

public class StarPattern10 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter he no ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=n-1;k>=i;k--) {
				System.out.print(" ");
			}

			for(int l=1;l<=i;l++) {
				System.out.print("^");
			}
				System.out.println(" ");
			
		
		}
		
		for(int i=2;i<=n;i++) {
			for(int k=2;k<=i;k++) {
				System.out.print(" ");
			}

			for(int b=n;b>=i;b--) {
				System.out.print("^");
			}
				System.out.println(" ");
			
		
		}
		}

}


