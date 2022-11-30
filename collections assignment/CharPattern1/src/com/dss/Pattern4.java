package com.dss;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
			int n=sc.nextInt();
		int alph=64;
				for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
		System.out.print((char)(alph+ j )+ " ");
							}
				System.out.println();
				}
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=i;j++) {
								System.out.print((char)(alph+ j )+ " ");
							}
									System.out.println();
		}
}
	}
