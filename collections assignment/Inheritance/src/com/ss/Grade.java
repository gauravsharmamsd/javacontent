package com.ss;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		char grade='A';
	
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		if(marks>=90) {
			System.out.println("student got gold medal");
		}
		else if(marks>80 && marks<=90) {
			System.out.println("pass 2 div");
		}
		else if(marks>60 && marks<=80) {
			System.out.println("pass 3 div");
		}
		else {
			System.out.println("fail");
		}
		// TODO Auto-generated method stub

	}

}
