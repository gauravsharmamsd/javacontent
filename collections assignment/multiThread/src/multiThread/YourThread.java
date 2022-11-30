package multiThread;

public class YourThread implements Runnable  {

	@Override
	public void run() {
	int i=0;
	while(i++<10) {
		System.out.println("Your thread is running");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}

}
