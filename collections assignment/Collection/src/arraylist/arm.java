package arraylist;

import java.util.Scanner;

public class arm {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no");
	//int n=sc.nextInt();
int res=arm.fact(5);
	System.out.println(res);
			
}

static int fact(int n) {
	int output;
	{
		if (n==1) {
			return 1;
		}
		output=n*fact(n-1);
		return output;
	}
}	
}