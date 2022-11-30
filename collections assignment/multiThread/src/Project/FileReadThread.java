package Project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadThread extends Thread{
	private Data data;
	public FileReadThread(Data d) {
		this.data=d;
	}
	public void run() {
		File f = new File("myfile.txt");
		FileReader fr = null;
		BufferedReader br = null;
		synchronized (data) {
			if(f.canRead()) {
				try {
					fr = new FileReader(f);
					br = new BufferedReader(fr);
					String line=null;
					if(data.list.size()>=5) {
						data.wait();
						System.out.println(Thread.currentThread().getName()+"Waiting");
					}else {
						while((line=br.readLine())!=null) {
							System.out.println(Thread.currentThread().getName()+" is reading");
							data.list.add(line);
							Thread.sleep(100);
							if(data.list.size()>=5)
								data.notify();
						}
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					try {
						fr.close();
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

	}
}
