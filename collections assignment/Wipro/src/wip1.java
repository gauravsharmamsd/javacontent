import java.util.Scanner;

public class wip1 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n= sc.nextInt();
			System.out.println(res(n));
			
//			int fact=1;
//			for(int i=1;i<=n;i++) {
//				fact=fact*i;
//			}
//			System.out.println(fact);

		}

	public static int res(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
//		System.out.println(fact);
	return fact;
		
			// TODO Auto-generated method stub
			
		}

	}


