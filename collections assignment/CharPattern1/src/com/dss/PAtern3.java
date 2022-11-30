package com.dss;

import java.util.Scanner;

public class PAtern3 {


	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
	
		int n=sc.nextInt();
		int alph=64;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			
			
				System.out.print((char)(alph+ j )+ " ");
				//alph++;
			}
			
			
			System.out.println();
		}

		for(int i=n+1;i>=0;i--) {
			for(int j=1;j<=i;j++) {
			
			
				System.out.print((char)(alph+  j)+ " ");
				//alph++;
			}
			
			
			System.out.println();
		}

}
}

