import java.util.Scanner;

public class Test {
static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Enter the no of element");
	int x=sc.nextInt();
	int [][]a=new int[2][x];
	for(int i=0;i<a.length;i++) {
	for(int j=0;j<a[i].length;j++) {
		a[i][j]=sc.nextInt();
	}

	}
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
			
		}
		System.out.println();
	}
	System.out.println(a[1][2]);
}
}