import java.util.Scanner;

public class Wip2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int x1=0;
		int x2=1;
		System.out.print("fibnnoci series upto "+x+" is");
		
			System.out.print("  "+x1+" "+x2+" ");

		
			for(int i=0;i<=x;i++) {
				
				int y=x1+x2;
			System.out.print(y+" ");
			x1=x2;
			x2=y;
			}
		}
		
		// TODO Auto-generated method stub

	
}
