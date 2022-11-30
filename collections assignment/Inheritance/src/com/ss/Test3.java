package com.ss;

import java.util.Scanner;

public class Test3 {
	int Empid;
	void set(){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt()
;		this.Empid=n;
	}

	void view(){
		System.out.println(Empid);
	}
	public static void main(String[] args) {
		Test3 t=new Test3();
		t.set();
		t.view();
		// TODO Auto-generated method stub

	}

}
