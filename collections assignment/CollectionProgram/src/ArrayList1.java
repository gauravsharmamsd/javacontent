
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		ArrayList al= new ArrayList();
		int x=sc.nextInt();
		for(int  i=0;i<x;i++) {
		al.add(sc.nextInt());
		}
		System.out.println(al.toString());
		// TODO Auto-generated method stub
	

}
}