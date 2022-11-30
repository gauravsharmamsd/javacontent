package Method;


	class ThreadDemo extends Thread{
		public void run() {
			for(int i=0;i<5;i++) {
				System.out.println(Thread.currentThread().getName()+"   "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					System.out.println("thread interrupted");
					System.out.println("________________________");
					
				}
			}
		}
	}
	public class Interrupt_{
		public static void main(String[] args) throws InterruptedException {
			Thread t1=new ThreadDemo();
			t1.start();
			t1.interrupt();
		}}