package multiThread;

import synchronised_method.Display;

public class MyThread extends Thread{
	
	public MyThread(Display d, String string) {
		// TODO Auto-generated constructor stub
	}

	public void run() {
		int i=0;
		while(i++<10) {
		System.out.println("MyThread is running");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
