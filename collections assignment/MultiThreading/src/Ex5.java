
public class Ex5 
	 extends Thread
	{
	public void run()
	{
	for (int i=0;i<10;i++)
	{ System.out.println("Thread is running......."+i);
	
	}
	try {
	Thread.sleep(1000);
	}
	catch(InterruptedException ie)
	{ ie.printStackTrace();
	
	}
	}
	public static void main(String[] args)
	{ Ex5 t = new Ex5();
	t.start();
	
	

	}
	}

