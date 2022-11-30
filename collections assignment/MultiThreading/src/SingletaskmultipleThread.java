
public class SingletaskmultipleThread 
extends Thread {
	public void run()
	{
		System.out.println("I am on the way");
	}
	public static void main(String args[]) {
		 SingletaskmultipleThread  s= new SingletaskmultipleThread ();
	s.start();
		 SingletaskmultipleThread s2 =new  SingletaskmultipleThread ();
		 s2.start();
	}
}


