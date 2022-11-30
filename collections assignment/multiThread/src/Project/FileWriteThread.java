package Project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteThread extends Thread{
	private Data data;
	public FileWriteThread(Data d) {
		this.data=d;
	}
	public void run() {
		File f = new File("copy.txt");
		if(f.canWrite()) {
			FileWriter fw = null;
			BufferedWriter bw = null;
			synchronized (data) {
				try {
					fw = new FileWriter(f);
					bw = new BufferedWriter(fw);

					while(true) {
						if(data.list.size()>=5) {
							while(true) {
								System.out.println(Thread.currentThread().getName()+" is writing");
								bw.write(data.list.get(0)+"\n");
								data.list.remove(0);
								Thread.sleep(100);
								if(data.list.size()<=0) {
									bw.flush();
									data.notify();
									break;
								}
							}
						}else {
							System.out.println(Thread.currentThread().getName()+"Waiting");
							data.wait();
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
						bw.close();

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}

	}
}

