package arraylist;

import java.util.Scanner;

public class StarPattern28 {
	public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enetr tbjkhe no you want to print");
	int n= sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int k=2;k<=i;k++) {
			System.out.print(" ");
		}
		
		for(int j=n;j>=i;j--) {
			if  (n==j)
			System.out.print("*");
			else
				System.out.print(" ");	
		}
		System.out.println();
	}
}

}
