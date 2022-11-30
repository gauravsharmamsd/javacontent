package arraylist;

import java.util.*;

public class StarPattern25 {
	public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enetr the no you want to print");
	int n= sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=n-1;j>=i;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			if(k==1 || i==n)
			System.out.print("*");
			else
				System.out.print(" ");
		}
		for(int k=n-1;k>=i;k--) {
			if(k==i || i==1)
			System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
	}

}
