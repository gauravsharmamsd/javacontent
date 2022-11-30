package multiThread;

public class Maiin {

	public static void main(String[] args) throws InterruptedException {
		Thread t=new MyThread();
			t.start();
			Runnable r=new YourThread();
			Thread t2=new Thread(r);
			t2.start();
			int i=0;
		while(i++<10) {
			System.out.println("Main thread is ruuning");
			Thread.sleep(200);
		}

	}

}
