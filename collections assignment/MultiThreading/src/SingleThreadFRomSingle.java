
public class SingleThreadFRomSingle extends Thread {
	public void run()
	{
		System.out.println("I am ont way");
	}
	public static void main(String args[]) {
		SingleThreadFRomSingle s= new SingleThreadFRomSingle();
		s.start();
	}
}
