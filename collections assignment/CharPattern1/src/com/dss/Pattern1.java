package com.dss;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
	int alph=65;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				
				System.out.print((char )(alph+j));
			
			}
			System.out.println();
		}
//		System.out.print("z");
		// TODO Auto-generated method stub

	}

}
