package avc.aa;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
int sum=0;
		for(int i=2;i<=n;i++) {
			int count=0;
			for(int j=1;j<=n;j++) {
				if(i%j==0) {
					count++;
				}
			}
				if(count==2) {
				for(int j=1;j<=n;j++) {
//						if(j%2==0);
//					}
			sum=sum+i;
				System.out.print(i+" ");
				//
				}
			
				}
		System.out.println();
		System.out.print("Sum of the given prime no   "+sum);
//				ArrayList al=new ArrayList<>();
//				al.add(i);
//				
					
				
		}
				
					}
		}
		
		// TODO Auto-generated method stub

	

