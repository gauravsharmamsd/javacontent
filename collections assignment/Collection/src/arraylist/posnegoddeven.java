package arraylist;

import java.util.Scanner;

public class posnegoddeven {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0) {
			if(n%2==0) {
				System.out.println("pos&even");
			}
			else {
				System.out.println("pos&odd");
			}
		}
		else {
			if(n%2==0) {
				System.out.println("neg&even");
			}
			else {
				System.out.println("neg&odd");
			}
		}
		}
}