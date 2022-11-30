
public class Yield extends Thread{
public void run()
{
	for(int i=0;i<10;i++)
	{ 
		Thread.yield();
	System.out.println("child thread");
	try{ Thread.sleep(2000); }
	catch(InterruptedException e)
	{ e.printStackTrace(); }
	}
	}
public static void main(String args[]) {
	Yield y =new Yield();
	y.start();
	try {
		y.join();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	for(int i=0;i<10;i++)
	{ System.out.println("main thread");
	}
	try{
		Thread.sleep(2000); }
	catch(InterruptedException e){e.printStackTrace();}
	}
	
	

	
}

