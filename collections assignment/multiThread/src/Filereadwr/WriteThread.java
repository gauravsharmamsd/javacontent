package Filereadwr;

import java.io.IOException;

public class WriteThread extends Thread{
	//Job of this thread is to Produce a product
	//when product is  consumed.
Main m=new Main();
	private FileRead file;
	WriteThread(FileRead file){
		this.file=file;
	}
	public void run() {	
		while(true) {
			synchronized(file) { //It will try to acquire lock
				//No rpducer acquires the lock
				if(file.equals(null)) {
					
					try {
						m.file.writeFile1();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					file.notify();//notification for producer
				}else {
					//producer has to wait for consumer thread
					//to consume product 
					try {
						file.wait();//wait will try release the lock on product and wait for notification from consumer
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

