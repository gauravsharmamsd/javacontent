package avc.aa;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println(" enter the no ");
		int no = sc.nextInt();
		int c=0;
		for(int i=1;i<=no;i++) {
			if(no%i==0) {
				c++;
			}
			
		}
		if(c==2) {
			System.out.println("prime no");
		}
		else {
			System.out.println("no");
		}
		// TODO Auto-generated method stub

	}

}
