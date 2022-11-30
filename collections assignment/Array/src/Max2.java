import java.util.Scanner;

public class Max2 {
//
		static int max2(int arr[]) {
			
			
			  for(int i = 0; i<arr.length; i++ ){
			         for(int j = i+1; j<arr.length; j++){
			            if(arr[i]>arr[j]){
			             int   temp = arr[i];
			               arr[i] = arr[j];
			               arr[j] = temp;
			            }
			         }
			      
		
		}
			
			return arr[arr.length-2];
			
		}
		

		static int min2(int arr[]) {
			
			
			  for(int i = 0; i<arr.length; i++ ){
			         for(int j = i+1; j<arr.length; j++){
			            if(arr[i]>arr[j]){
			             int   temp = arr[i];
			               arr[i] = arr[j];
			               arr[j] = temp;
			            }
			         }
			      
		
		}
			
			return arr[1];
			
		}
	
	public static void main(String args[]) {
		Scanner sc =new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		min2(arr);
		//max(arr);
		System.out.println( " the sec smallestt element is" +" :"+ min2(arr));
		System.out.println( " the sec largest element is" +" :"+ max2(arr));
	
	}

}
