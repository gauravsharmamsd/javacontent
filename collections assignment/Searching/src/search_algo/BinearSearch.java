package search_algo;
import java.util.Scanner;

public class BinearSearch {
	public static void binarSearch(int arr[],int first,int last,int key) {
		int mid=(first+last)/2;
		while(first<=last) {
			if(arr[mid]>key) {
				last=mid-1;
			}
			else if(arr[mid]==key) {
				System.out.println("element found at"  +" "    +mid);
				break;
			}
			else {
				first=mid+1;
			}
			mid=(first+last)/2;
		}
		
		if(first>last) {
			System.out.println(" not");
		}
	}
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++) {
		//	System.out.print(arr[i]+" ");
		}
		System.out.println();
	int last = n-1;
	int key = sc.nextInt();
	
	BinearSearch.binarSearch(arr,0,last,key);
		//System.out.println(res+" found at");
	}
}