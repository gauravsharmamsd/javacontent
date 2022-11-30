package arraylist;

import java.util.Scanner;

public class armstrong {



	
	
	public static void main(String args[]) {
		int temp=0,count=0;
		int prod=1,sum=0,digit;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int n=sc.nextInt();
	
		temp=n;
		while(temp>0) {
			count++;
			//System.out.println(count);
		
			temp=temp/10;
		
			if(temp==0) {
		System.out.println(count);
		}
			
	
		}
		int temp1=n;

		System.out.println(temp1);
		
	while(temp1>0) {
			 digit=temp1%10;prod=1;
			for(int i=1;i<=count;i++) {
				prod=prod*digit;
			}
			
			sum=sum+prod;
			temp1=temp1/10; 		
			if(temp1==0) {
				System.out.println(sum);
				
			
			}
	}
	
	//	System.out.println(sum);
			if(n==sum) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
	

	}

