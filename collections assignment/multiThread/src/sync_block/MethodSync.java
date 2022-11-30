package sync_block;

import multiThread.MyThread;

public class MethodSync {

	public static void main(String[] args) {
		Display d1=new Display();
		Display d2=new Display();
		MyThreadd t1=new MyThreadd(d1,"Msd");
		MyThreadd t2=new MyThreadd(d2,"yuvi");
		t1.start();
		t2.start();
	}

}
