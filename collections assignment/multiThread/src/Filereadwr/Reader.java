package Filereadwr;


public class ConsumerThread extends Thread{
	//Job of this thread is to consume a product
	//when product is ready to be consumed.

	private Product product;
	ConsumerThread(Product p){
		this.product=p;
	}
	public void run() {	
		while(true) {
			synchronized(product) { //It will try to acquire lock
				//Say consumer acquires the lock
				if(product.isAvailable()) {//This will be false
					product.consume();
					product.notify();//notification for producer
				}else {
					//consumer has to wait for producer thread
					//to make product available
					try {
						product.wait();//wait will try release the lock on product and wait for notification from producer
						//wait over 
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
