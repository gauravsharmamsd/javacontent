import java.util.Scanner;

public class Wip3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x=sc.nextInt();
	int count=0;
for(int i=0;i<=x;i++) {
	try {
	if(x %i ==0) {
		count++;
	}
}
	catch(ArithmeticException e) {
		//printStackTree(e);
	}
}

if(count ==2) {
System.out.println("Prime no");
	}
else
	System.out.println("not Prime no");

}}