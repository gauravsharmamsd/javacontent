package Sorting_java;

import java.util.Scanner;

public class Bubble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]  +  "   ");
		}
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
				int t=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=t;
				}
			
			}
		}
		System.out.println("arary after bubble sort");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]  +  "   ");
		}
		// TODO Auto-generated method stub

	}

}
