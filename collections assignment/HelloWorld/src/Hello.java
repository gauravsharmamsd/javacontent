class X{
	
	static {
		System.out.println("inside static block of X");
	}
}
class X1{
	
	static {
		System.out.println("inside static block of X1");
	}
}


public class Hello {
	public static void main(String[] args) throws Exception {

		
	Class c=Class.forName(args[0]);
	args[0] d = (args[0])c.newInstance();
	d.X();
		// TODO Auto-generated method stub

	}

}
