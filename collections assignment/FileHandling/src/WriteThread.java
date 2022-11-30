import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteThread extends Thread {
ArrayList al=new ArrayList();
	private Mediar  al1;
	WriteThread(Mediar  al1,ArrayList al){
		this.al1=al1;
		this.al=al;
	}
public void run() {
	while(true) {
		synchronized(al1) { //It will try to acquire lock
			//No rpducer acquires the lock
			if(!al1.equals(null)) {
				al1.Write();try {
					if(al.size()<10) {
					al1.wait();}
					}
			
				catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			al1.getAl();
					al1.notify();}
				else {
					
try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
	
		}}}}
	



