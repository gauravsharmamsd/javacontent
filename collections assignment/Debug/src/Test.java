import java.util.Scanner;

public class Test {
private static Scanner sc=new Scanner(System.in);
static Demo d= new Demo();
	public static void main(String[] args) {
		int a=sc.nextInt();
		int b=sc.nextInt();
		int l=d.divide(a,b);
		System.out.println(l);
		// TODO Auto-generated method stub
	}
	}
 class Demo{
	 int divide(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
