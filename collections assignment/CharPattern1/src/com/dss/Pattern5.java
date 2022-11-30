package com.dss;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("the no u wNYT ");
		int n= sc.nextInt();
	int alph=64;
			for(int i=n;i>=1;i--) {
				for(int j=0;j<i;j++) {
			System.out.print((char)((alph+n)-j)+ " " );
			}			alph--;
			System.out.println();
		}
			for(int i=2;i<=n;i++) {
				int alaph=64;
		
			for(int j=1;j<=i;j++) {
				System.out.print((char)(alaph+i)+ " " );
				alaph--;
			}
						System.out.println();
		}
	}
}
