package Synchronization;


public class TestSynchronization {

	public static void main(String[] args) throws InterruptedException {
		SomeThread t1 = new SomeThread();
		SomeThread t2 = new SomeThread();
		t1.start();
		t2.start();
		Thread.sleep(500);
		System.out.println("While t1 is sleeping State of t1 is "+t1.getState());
		System.out.println("State of t2 before t1 is done is "+t2.getState());
		t1.join();
		System.out.println("State of t2 after t1 is done is "+t2.getState());

	}

}

class SomeThread extends Thread{
	 A a = new A();
	public void run() {
		a.m1();
	}
}
