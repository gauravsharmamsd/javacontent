package Sorting_java;

import java.util.Scanner;

public class Selection_sort {

	public static void main(String[] args) {
	

		
			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++)
			{
				a[j]=sc.nextInt();
				
			}
			
			for(int i=1;i<n;i++) {
				int temp =a[i];
				int j=i-1;
				while(a[j]>a[i] && j>=0) {
					a[j+1]=a[j];
							j--;
				}
				a[j+1]=temp;
			}
			for(int j=0;j<n;j++)
			
System.out.println(a[j]);
			}
		}
		// TODO Auto-generated method stub

	


