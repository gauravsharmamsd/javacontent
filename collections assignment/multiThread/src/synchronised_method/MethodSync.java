package synchronised_method;

import multiThread.MyThread;

public class MethodSync {

	public static void main(String[] args) {
		Display d=new Display();
		MyThreadd t1=new MyThreadd(d,"Msd");
		MyThreadd t2=new MyThreadd(d,"virat");
		t1.start();
		t2.start();
	}

}
