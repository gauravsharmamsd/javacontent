package com.ss;


public class Width {
	int x;
	float y;
	double z;

	void width(int x) {
	x=x;
		System.out.println("width" + "=" + x);
	}
	void height(float y) {
		y=y;
		System.out.println("width"+"="+  x);
	}
	void depth(double z) {
		z=z;
		System.out.println("width"+"="+  z);
	}
	

	public static void main(String args[] ){
		Width w=new Width();
		w.width(2);
		w.height(20);
		w.depth(30);
	}
	

}
