package arraylist;

import java.util.Scanner;

public class StarPattern30 {
	public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enetr the no you want to print");
	int n= sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n+1;j++) {
			if(j%2==0)
			System.out.print("*"+"     ");
		}
		System.out.println();
	}
	
}
}
