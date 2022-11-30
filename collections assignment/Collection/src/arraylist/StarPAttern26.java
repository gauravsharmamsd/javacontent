package arraylist;

import java.util.Scanner;

public class StarPAttern26 {

	public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enetr tbjkhe no you want to print");
	int n= sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=n;j>=i;j--) {
			if( j==i)
			System.out.print("*");
			else
				System.out.print(" ");	
		}
		System.out.println();
	}
}
}