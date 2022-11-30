package sync_block;

public class Display{
  public void wish(String name, Display d) {
   synchronized(Display.class) {
	for(int i=0;i<5;i++) {
		System.out.print("Good morning  :");
		System.out.println(name);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	}
}
}
