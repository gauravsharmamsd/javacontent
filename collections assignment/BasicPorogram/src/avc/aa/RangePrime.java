package avc.aa;

import java.util.Scanner;

public class RangePrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
	//	for(int i=50;i<=n;i++) {
			int count=0;
			for(int j=1;j<=n;j++) {
				if(n%j==0) {
					count++;
				}
			}
				if(count==2) {
				System.out.print("prime");
			}
			
			else 
				System.out.print(" nlot prime");
		
			}

		}
		// TODO Auto-generated method stub
			
	


