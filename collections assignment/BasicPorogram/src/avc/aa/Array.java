package avc.aa;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
		arr2[i]=arr1[i];
		// TODO Auto-generated method stub
		}
	
	
	for(int i=0;i<n;i++) {
System.out.println(arr2[i]);

}
		
}
}