package avc.aa;

import java.util.Scanner;

public class ObjectCopy {
private	 int n1;
private	String s;
	ObjectCopy(int n1,String s){
		this.n1=n1;
		this.s=s;
	}
	ObjectCopy(ObjectCopy o){
		n1=o.n1;;
		s=o.s;
	}
	
	public void Result() {
		System.out.println(n1);
		System.out.println(s);
		
	}
		public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n1=sc.nextInt();
	String s=sc.next();
	 ObjectCopy o1=new ObjectCopy(n1, s);
	 ObjectCopy o2=new  ObjectCopy(o1);
	 o1.Result();
	 o2.Result();	 
	 
	 
		// TODO Auto-generated method stub

	}

}
