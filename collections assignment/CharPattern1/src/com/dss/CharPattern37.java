package com.dss;

import java.util.Scanner;

public class CharPattern37 {

	public static void main(String[] args) {
		Scanner scx =new Scanner(System.in);
		int n=scx.nextInt();
		int a=65;
		int b=66;
		System.out.println("Enter the no of row you wamt to print");
		
		for(int i=0;i<=n;i++) {
			b--;
			for(int j=0;j<=i;j++){
			System.out.print((char)(a+n-j)+" ");
		}
			for(int j=n;j>i;j--) {
				System.out.print((char)(n+b)+" ");
			}
		System.out.println(" ");
	}
		
		}
	

}