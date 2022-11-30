import java.io.*;

public class Join extends Thread {
	public void run() {
		try {
			Thread.sleep(100);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("We are 1");
	}

	public static void main(String[] args) {
		Join t1= new Join();
		Join t2= new Join();		
		Join t3= new Join();
		t1.start();
		try {
			t2.join();
		}
		catch(Throwable e){
			System.out.println(e);
		
		}
			
			
		
		t2.start();
		t3.start();
		// TODO Auto-generat		Join j1= new Join();ed method stub

	}

}
