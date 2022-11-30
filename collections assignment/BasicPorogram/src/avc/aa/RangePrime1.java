package avc.aa;

import java.util.Scanner;

public class RangePrime1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no=sc.nextInt();
		for(int i=2;i<=no;i++) {
			int count=0;
					for(int j=1;j<=i;j++) {
						if(i%j==0) {
							count++;
						}
					}
					if(count==2) {
						System.out.print(i+" ");
					}
		}
		// TODO Auto-generated method stub

	}

}
