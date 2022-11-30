import java.util.Scanner;

public class ArrayFreq {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println("enter the no of element in an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int freq[]=new int[n];	
		System.out.println("enter the  element in an array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			freq[i]=-1;
		}
		for(int i=0;i<n;i++) {
			count=1;
			for(int j=i+1;j<n;j++) {
				if((arr[i]==arr[j])) {
					freq[j]=0;
					count++;
					
				}
			}
			if(freq[i]!=0) {
				freq[i]=count;
			}
			
		}
		for(int i=0;i<n;i++) {
			if(freq[i]!=0 ) {
				System.out.println(arr[i]+"  occur at  "+freq[i]);
			}
		}
	}

}
