
abstract class animal{
	abstract void run();
}



class Overload extends animal{
	public void run() {
		System.out.println("bckjaLKDmm");
	}
	public static void main(String args[]) {
		Overload o = new Overload();
		o.run();
	}
	
}