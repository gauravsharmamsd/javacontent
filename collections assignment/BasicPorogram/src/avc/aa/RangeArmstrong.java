package avc.aa;

import java.util.Scanner;

public class RangeArmstrong {

	public static void main(String[] args) {
		int sum=0;
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
for(int i=1;i<=n;i++) {
	int temp=i;
	while(temp>0) {
		int b=temp%10;
		sum=sum+b*b*b;
		temp=temp/10;
		
	}
	if(sum==i) {
		System.out.println(i+ " ");
	}
	sum=0;
}
	}

}
