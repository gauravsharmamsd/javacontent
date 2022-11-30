import java.io.File;

public class FileMonitor {
	public static void main(String[] args) {
		//Every 30 seconds check if files have arrived
		
		while(true) {
			System.out.println("checking if new files have arrived ...");
			File[] files = new File("./bin/input").listFiles();
			int noOfFiles = files.length;
			
			for(File f: files) {
				FileValidatorThread fvt=new FileValidatorThread(f,noOfFiles);
				fvt.start();
			}
			try {
				Thread.sleep(30000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
