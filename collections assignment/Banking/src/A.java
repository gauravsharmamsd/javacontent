
public class A {
	private String msg;
	A(){
		System.out.println("HUxkh");
	}
	void m1() throws Exception{
		m2("abc","addjh");
	}
	private void m2(String uid, String psd) {
		if(!uid.equals("ABC")|| !psd.equals("husu"))
		throw new Exception();
	}
	public static void main(String args[]) {
		A a=new A();
	a.m1();
				
		// TODO Auto-generated method stub
		
	}
	

}
