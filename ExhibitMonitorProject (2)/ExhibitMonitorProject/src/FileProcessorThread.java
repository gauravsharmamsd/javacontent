import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProcessorThread extends Thread{
	String fileName;
	String outFileName;
	public FileProcessorThread(String fileName, String outFileName){
		this.fileName = fileName;
		this.outFileName=outFileName;
		this.start();
	}
	public void run() {
		System.out.println("Processor running");
		System.out.println(fileName);
		readFile(fileName);

	}
	private void readFile(String fname) {
		System.out.println("Read File Running");
		File f = new File("./bin/inprocess/"+fname);
		FileWriter fw     = null;
		BufferedWriter bw = null;
		FileReader fr     = null;	
		BufferedReader br = null;

		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);

			fw = new FileWriter("./bin/inprocess/"+outFileName);
			bw = new BufferedWriter(fw);
			String line = null;
			int nooflines=0;
			while((line=br.readLine()) !=null) {
				System.out.println(line);

				bw.write(line+"\n");
				Thread.sleep(500);
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
				br.close();
			}catch(Exception e) {
				e.printStackTrace();
			}



		}
	}

}
