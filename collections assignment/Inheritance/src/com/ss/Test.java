package com.ss;

public class Test {

int i;
void m( int i) {
	System.out.println(this.i);
}
public static void main(String args[]) {
Test t=new 	Test();
t.m(10);
}
}
