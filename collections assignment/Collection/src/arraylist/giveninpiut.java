package arraylist;

public class giveninpiut {
public static void main(String args[]) {
	int[] arr= {5,4,6,8};
	int search=5;
	int low=0;
	int high=arr.length-1;
	int mid=(low+high)/2;
	while(low<=high) {
		 if(arr[mid]<search) {
			 low=mid+1;
		 }
		
		 else if(arr[mid]==search) {
		 
			 System.out.println(search+" fount st loc "+mid);
			 break;
		  }
		 else {
			 high=mid-1;
		 }
		 if(low>high) {
			 System.out.println("vvj");
		 }

}
}
}

