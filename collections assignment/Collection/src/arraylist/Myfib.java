package arraylist;
import java.util.Scanner;
public class Myfib {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter no how many fib you want");
		int n=s.nextInt();
		int res=Myfib.fibn(n);
		
	}
	static int fibn(int n){
		int a=0,b=1;
		System.out.print(a+" "+b  );
		for(int i=2;i<=n;i++) {
			int c=a+b;
		
			System.out.print(" " +c);
			a=b;
			b=c;
		}
		return 1;
		
	}
}
	
