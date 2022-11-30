
public class Main {
public static void main(String[] args) {
I m=new MyClass();
	m.m1("Keshav");
	
	
	I z=new I() {
	public void m1(String so) {
		System.out.println("of anoyms   "+so);
	}
	};
	z.m1("Kunal");
	  
	I xx=(s)->{
	System.out.println("of lambda   "+s);
};
xx.m1("Ajay");
}
}


