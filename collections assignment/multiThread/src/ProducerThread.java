

public class ProducerThread extends Thread{
	//Job of this thread is to Produce a product
	//when product is  consumed.

	private Product product;
	ProducerThread(Product p){
		this.product=p;
		System.out.println(p.isAvailable());
	}
	public void run() {	
		while(true) {
			synchronized(product) { //It will try to acquire lock
				//No rpducer acquires the lock
				if(!product.isAvailable()) {
					
					product.produce();
					product.notify();//notification for producer
				}else {
					//producer has to wait for consumer thread
					//to consume product 
					try {
						product.wait();//wait will try release the lock on product and wait for notification from consumer
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}//Its a method on java.lang.Object
					 
				}
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

