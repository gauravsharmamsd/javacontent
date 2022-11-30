package com.ss;

public class t2 {
	
	 t1(){
	 this(100);
	System.out.println("0-arg constructor logics");
	}
	t2(int a)
	{ this('g',10);
	System.out.println("1-arg constructor logics");
	}
	t2(char ch,int a)
	{ System.out.println("2-arg constructor logics");
	}
	public static void main(String[] args)
	{ t2 t = new t2();

	}

}