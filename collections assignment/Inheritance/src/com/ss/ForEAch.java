package com.ss;

import java.util.Scanner;

//import java.util.Scanner;
//
public class ForEAch {
	  public static int maximum(int[] numbers)
	    {
	        int maxSoFar = numbers[0];
	         
	        // for each loop
	        for (int num : numbers)
	        {
	            if (num > maxSoFar)
	            {
	                maxSoFar = num;
	            }
	        
	    return maxSoFar;
	    }

	    }
	    public static void main(String[] arg)
	    {
	    	Scanner sc=new Scanner(System.in);
		System.out.println("entrt the no of students : ");
			int n=sc.nextInt();
			System.out.println("entrt the marks of students : ");
			int[]max=new int[n];
			for(int i=0;i<=max.length;i++) {
			max[i]=sc.nextInt();
			}
	       int highest_marks =ForEAch.maximum(max);
	       
	            System.out.println("The highest score is " + highest_marks);
	       
	    }	    }
	
	
	
	
	

//	public static int Marks(int[] numbers) {
//		int maxSofar=numbers[0];
//		for(int num :numbers) {
//			if(num>maxSofar) {
//				maxSofar=num;
//		}
//		}
//			return maxSofar;
//	
//	}
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("entrt the no of students : ");
//		int n=sc.nextInt();
//		System.out.println("entrt the marks of students : ");
//		int[]max=new int[n];
//		for(int i=0;i<=max.length;i++) {
//			max[i]=sc.nextInt();	
//			}
//			int l=Marks(max);
//		// TODO Auto-generated method stub
//System.out.println(l);
//	
//}
//	}
//
//
