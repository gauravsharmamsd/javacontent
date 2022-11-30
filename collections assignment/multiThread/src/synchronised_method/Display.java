package synchronised_method;

public class Display{
 synchronized public void wish(String name) {
	for(int i=0;i<5;i++) {
		System.out.print("Good morning  :");
		System.out.println(name);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
