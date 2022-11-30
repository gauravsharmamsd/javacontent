package avc.aa;

import java.util.Scanner;

public class RangeP {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		for(int j=2;j<=n;j++) {
			int count =0;
			for(int i=1;i<=j;i++) {
				if(j%i==0)
				count++;
			
		}
		if(count==2) {
			System.out.print(" "+j);
		}
		// TODO Auto-generated method stub

	}

}
}

