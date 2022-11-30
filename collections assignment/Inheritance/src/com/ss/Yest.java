package com.ss;

public class Yest {
int x;
void s(int x) {
	this.x=x;
	
}
void s1() {
	System.out.println(x);
}
public static void main(String args[]) {
	Yest y=new Yest();
	y.s(10);
	y.s1();
	
}
}
