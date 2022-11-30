package arraylist;

import java.util.Scanner;

public class linearSearch {

	public static void main(String args[]) {
		int element = 0;
		int temp=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of element :" );
		
	int num=sc.nextInt();
	//creating an array
	int []arr=new int[num];
	for(int i=0;i<num;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter number for search :" );
	element=sc.nextInt();
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==element) {
			System.out.println(element+" is present at loc "+(i+1));
		temp++;
		}
		
	}
	if(temp==0) {
		System.out.println("elemrnt not found");
	}
}
}