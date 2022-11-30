package arraylist;

import java.util.Scanner;

public class StarPAttern17 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter he no ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				
			if( k==1 || k==i || i== n) {

				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			}
				System.out.println();
		
			
		}
}
}
