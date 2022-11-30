package com.dss;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
	int alph=64;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print((char)(alph+j)+(" ") );
			
			}
			System.out.println();
		}
	}

}
