import java.util.Arrays;

public class insertAtspecific {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int res[]=new int[arr.length+1];
		int index=4;
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+"  ");
		}
		
	System.out.println();
	for(int j=arr.length;j>index;j-- ) {
	res[j]=arr[j-1];


	}
	res[index]=10;

	for(int i=0;i<index;i++) {
		res[i]=arr[i];
	}
	System.out.println(Arrays.toString(res));
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
	}

	

}
