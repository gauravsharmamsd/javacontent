package arraylist;
import java.util.Scanner;
public class StarPAttern18 {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enetr the no youy want to print");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=n;j>=i;j--) {
			if(j==n || i==1 || j==i) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
