import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ReadThread  extends Thread {
	ArrayList al;
	private Mediar  al1;
	ReadThread(Mediar  al1,ArrayList al){
		this.al1=al1;
		this.al=al;
	}
public void run() {
	while(true) {
		synchronized(al1) { //It will try to acquire lock
			//No rpducer acquires the lock
			if(!al.equals(null)) {
				
				if(al.size()<=10) {
					 al1.read();
				}
			}else {
				try {
					if(al.size()>10) {
						al1.getAl();
						
					al1.wait();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	
		}}}}
	
