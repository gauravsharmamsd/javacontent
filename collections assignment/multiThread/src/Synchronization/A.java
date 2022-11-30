package Synchronization;


public class A {
	
	synchronized void m1() {
		System.out.println("Thread "+Thread.currentThread().getName()+" entered m1");
		System.out.println(Thread.currentThread().getName()+" m1 is running ");
		try {
			 System.out.println("Before sleep State of "+Thread.currentThread().getName()+" is "+Thread.currentThread().getState());
			 Thread.sleep(3000);
			 System.out.println("After Sleep State of "+Thread.currentThread().getName()+" is "+Thread.currentThread().getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" Now done with m1 ..releasing lock");
	}

}
