package arraylist;
import java.util.Scanner;
public class BinarySearch {

	public static void main(String args[]) {
		int search=0;
		Scanner sc= new Scanner(System.in);
	System.out.println("enetr the items");
	int n=sc.nextInt();
	int []arr=new int[n];
	System.out.println("elemebt of arru");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("elemebt u wan tto sRCH");
	 search=sc.nextInt();
	 int low=0;
	 int high=n-1;
	 int mid=0;
	 while(low<=high) {
//		 mid=(low+high)/2;
//	 if(arr[mid]<search) {
//		 low=mid+1;
//		 high =mid-1;
//		 
	 }
	
	 else if(arr[mid]==search) {
	 
		 System.out.println(search+" fount st loc "+mid);
		 break;
	  }
	 else {
		 high=mid-1;
	 }
	 
	 }
	 if(low>high) {
		 System.out.println("invalid");
	 }
	}
}
		 
		 
		 
		 
	 
	 
	 