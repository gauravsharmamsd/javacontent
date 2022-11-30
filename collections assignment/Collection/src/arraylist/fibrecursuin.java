package arraylist;

public class fibrecursuin {
	static int a=0,b=1,c;
public static void main(String args[]) {

	System.out.print(a+" "+b);
	fibrecursuin f=new fibrecursuin();
	f.printFib(10);
}
void printFib(int i) {
if(i>=1) {
	int c=a+b;
	System.out.print(" " +c);
	a=b;
	b=c;
	printFib(i-1);
	
}
}

}