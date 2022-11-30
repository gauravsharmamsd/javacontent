package arraylist;

import java.util.Scanner;

public class StarPattern29 {

	public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enetr tbjkhe no you want to print");
	int n= sc.nextInt();
	
	for(int i=1;i<=n;i++) {
		for(int j=2;j<=i;j++) {
		System.out.print(" ");
			}
		for(int k=2*n-1;k>=2*i-1;k--)
		{
			if(k==2*n-1 || k==2*i-1 )
			System.out.print("*");
		else
			System.out.print(" ");
		}
	
		System.out.println();
	}
	for(int i=2;i<=n;i++) {
		for(int j=n-1;j>=i;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<=(2*i)-1;k++) {
			if(k==1|| k==(2*i)-1)
			System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
	
