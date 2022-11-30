package com.ss;

public class Test1 {
int i;
static void m( int i) {
	Test1 t= new Test1();
	
	System.out.println(t.i);
}
public static void main(String args[]) {
//Test t=new 	Test();
Test1.m(10);
}
}


