
public class Sleep extends Thread {
	public void run()
	{
		for(int i=0;i<5;i++) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
		
		System.out.println("I like u");
	}
	}
	public static void main(String[] args) {
		Sleep s= new Sleep();
		s.start();
		// TODO Auto-generated method stub

	}

}
