import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
int t=sc.nextInt();
int arr[]=new int[t];
for(int i=0;i<t;i++) {
	arr[i]=sc.nextInt();
}

for(int l:arr) {
	System.out.print(l+" ");
}

	}

}
