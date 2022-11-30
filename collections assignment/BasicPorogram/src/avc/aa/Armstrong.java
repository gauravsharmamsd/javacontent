package avc.aa;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		int temp=n;
		int count=0;
		while(temp>0) {
			count++;
						temp=temp/10;
					}
		System.out.println("no of digit    " +count);
	

	int z=n;
//	System.out.println(z);
	
	int sum=0;
	while(z>0) {
		int mul=1;
	int	digit=z%10;
	for(int i=1;i<=count;i++) {
		mul=mul*digit;
	}
	sum=sum+mul;
	z=z/10;
	}
	
//	System.out.println(sum);
		
	
	if(sum==n) {
		System.out.println("armstring no");
	}
	else
		System.out.println(" no");
	}


}