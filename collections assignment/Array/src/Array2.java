	import java.util.Scanner;
public class Array2 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int [] arr=new int[n];
			int arr2[]=arr;
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.print("original array is"+" ");
			for(int i=0;i<n;i++) {
				
				System.out.print( arr[i]+ " " );
			}
			System.out.println();
			System.out.print("copied array is ");
			for(int i=0;i<n;i++) {
				System.out.print(+arr2[i]+ " " );
			}
		
		}
		
	
}
