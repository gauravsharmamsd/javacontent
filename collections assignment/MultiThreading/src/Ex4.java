
public class Ex4 
	 extends Thread
	{ 
	public void start()
	{ System.out.println(" user  thread");
	}
	

	 public static void main(String[] args)
	{ 
		 Ex4 t=new Ex4();
	t.start();
	for (int i=0;i<5 ;i++ )
	{ System.out.println("main thread");
	}
	}
	}

