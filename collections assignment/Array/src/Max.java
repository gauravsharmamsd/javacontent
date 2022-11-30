import java.util.Scanner;

public class Max {
	
	static int max(int arr[]) {
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max= arr[i];
			}
			
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr  [] = new int [5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		max(arr);
		System.out.println(max(arr));
		// TODO Auto-generated method stub

	}

}
