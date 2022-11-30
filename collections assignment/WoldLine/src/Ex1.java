import java.util.Scanner;

public class Ex1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String res=" ";
		System.out.println("Enetr the no of string you want to conccatenate");
	    int n=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++) {
        arr[i]=sc.next();
		
		res=res+arr[i];
		}
		System.out.println(res);
		}
		}
	