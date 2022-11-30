 class MyThread1 extends Thread {
	public void run()
	{
		System.out.println("I am on way");
	}
}
class MyThread2 extends Thread {
	public void run() {
		System.out.println("I am seeing");
	}
}
class MyThread3 extends Thread {
	public void run() {
		System.out.println("I am studying");
	}
}
public class MultipleTaskFromMultiplThread {

	public static void main(String args[]) {
		MyThread1 s= new MyThread1();
		s.start();
		MyThread2 s2= new MyThread2();
		s2.start();
		MyThread3 s3= new MyThread3();
		s3.start();
	}
}


