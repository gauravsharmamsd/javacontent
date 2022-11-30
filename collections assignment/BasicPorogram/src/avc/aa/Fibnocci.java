package avc.aa;

import java.util.Scanner;

public class Fibnocci {

	public static void main(String[] args) {
	int a=0;
	int b=1;

		Scanner sc =new Scanner(System.in);
	//	System.out.println(" enter the no");
		int n=sc.nextInt();
		System.out.print(a+" "+b);
	for(int i=3;i<=n;i++) {
	int c=a+b;
	
		System.out.print(" "+c);
		a=b;
		b=c;
		
		
	}
		// TODO Auto-generated method stub

	}

}
