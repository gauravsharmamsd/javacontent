package com.ss;
abstract class Bike{  
	  abstract void run() ;
	  }
	  
	
	class Honda4 extends Bike{  
	void run(){System.out.println("running safely");}  
	}
	class Testh{
	public static void main(String args[]){  
	 Honda4 obj = new Honda4();  
	 obj.run();  
	}
	}
	