import java.util.Scanner;

public class Freq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		int freq=1;
		int n =sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
				}
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			if(arr[i]==arr[j]) {
				freq++;
				count++;
				
				
			}
			count =0;
			
		}
		System.out.println(arr[i]+" "+freq);
	}
		// TODO Auto-generated method stub

	}

}
