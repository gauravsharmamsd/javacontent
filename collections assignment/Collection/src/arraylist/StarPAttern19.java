package arraylist;

import java.util.Scanner;

public class StarPAttern19 {

public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enetr the no youy want to print");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(" ");
		}
		for(int k=n;k>=i;k--) {
			if(i==1 || k==i|| k==n) {
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
