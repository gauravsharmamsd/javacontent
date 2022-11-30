import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		int sum=0;
		int n= sc.nextInt();
		int arr1 []= new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
				}
		System.out.println("Original array is");
		for(int i=0;i<n;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++) {
		 sum =sum+arr1[i];
		}
		 System.out.println("the sum of array is:" +sum);
		// TODO Auto-generated method stub

	}

}
