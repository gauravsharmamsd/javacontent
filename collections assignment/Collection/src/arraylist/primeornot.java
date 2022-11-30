package arraylist;
import java.util.Scanner;
public class primeornot {
public static void  main(String args[]) {
	int count=0,i=0;
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(i=2;i<n;i++) {
		if(n%i==0) {
			count++;
			break;
		}

	}
	if(count==0)
	{		System.out.println("prime");
		}
			else {
				System.out.println("nprime");
			}
		}

}

