
public class Priority extends Thread {
public void run()
{
	System.out.println("Windies"+" "+Thread.currentThread().getPriority()+" "+Thread.currentThread().getName());
	
}
	public static void main(String[] args) {
		Priority p=new Priority();

	System.out.println(p.getPriority());
	
	System.out.println(p.getName());
	p.setName("Hindu");
		p.setPriority(Thread.NORM_PRIORITY);
		p.start();
		// TODO Auto-generated method stub

	}

}
