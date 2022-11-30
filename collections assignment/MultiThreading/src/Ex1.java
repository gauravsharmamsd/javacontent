
public class Ex1
			extends Thread{

public void run()
{		
			for (int i=0;i<10;i++)
			{ System.out.println("userdefined Thread");
			}
			}
 
			
				public static void main(String[] args)
			{ 
					Ex1 t=new Ex1();
			t.start();
			//business logic of main Thread
			for (int i=0;i<10;i++)
			{ System.out.println("Main Thread");
			}
			}
			}
		// TODO Auto-generated method stub

	


