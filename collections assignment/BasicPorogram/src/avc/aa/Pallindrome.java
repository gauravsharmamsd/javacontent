package avc.aa;

import java.util.Scanner;

public class Pallindrome {
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int res=0;	
	int n= sc.nextInt();
	int temp=n;
	while(temp!=0) {
		int rem=temp%10;
		 res=res *10 +rem;
		 temp=temp/10;
		}
	if(res==n) {
			System.out.println(" pallndrome");
		}
	else {	System.out.println(" not pallindrome");
	}
	}
}
		// TODO Auto-generated method stub

	


