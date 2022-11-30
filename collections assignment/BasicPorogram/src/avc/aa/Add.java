package avc.aa;

import java.util.Scanner;

public class Add {


	public static void main(String args[]){
	    int sum,x,y;  //variable declaration     //1
	    Scanner scan=new Scanner(System.in);
	//create a scanner object for input
	System.out.print("Enter the value for x: ");
	x=scan.nextInt();                              //2
	System.out.print("Enter the value for y: ");
	y=scan.nextInt();
	     sum=add(x,y);         //3,4
	   System.out.print("Sum of two numbers are:"+sum);//5
	} 
	static int add(int x, int y)    //recursive method definition
	{
	    if(y==0)
	        return x;
	    else
	        return(1+add(x,y-1));
	}
	}
