package arraylist;

import java.util.Scanner;

public class StarPattern6 {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no of ig u want to print");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=2;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=n*2-1;k>=i*2-1;k--) {
				System.out.print("*");
				
			}System.out.println();
			
				
			
		}
	}
		
}
