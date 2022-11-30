package com.ss;

public class SingleLevel {
	void m1(){
		System.out.println(" i ma eating");
	}
}
	class SingleLevel2 extends SingleLevel{
		void m2() {
			System.out.println(" not eating");
	}
	}

	public static void main(String[] args) {
		SingleLevel s= new SingleLevel();
		s.m1();
		SingleLevel2 s2= new SingleLevel2();
		s2.m1();
		s2.m2();
		// TODO Auto-generated method stub

	}


	}
