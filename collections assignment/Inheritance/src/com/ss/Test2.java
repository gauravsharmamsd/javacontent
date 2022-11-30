package com.ss;
//User defined Constructor
public class Test2 {
	void m1() {
		System.out.println("im here");
	}
	Test2(){
		System.out.println(" 0 arg Constructor");
	}
Test2(int i){
	System.out.println(" 1 arg Constructor");
}

	public static void main(String[] args) {
		Test2 t= new Test2();
		Test2 tu= new Test2(10);
		
		t.m1();
		tu.m1();
		// TODO Auto-generated method stub

	}

}
