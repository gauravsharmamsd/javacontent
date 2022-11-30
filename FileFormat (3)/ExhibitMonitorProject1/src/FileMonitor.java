import java.io.File;

public class FileMonitor {
	public static void main(String[] args) {
		//Every 30 seconds check if files have arrived
		
		while(true) {
			System.out.println("Checking if new files have arrived ...");
			File[] files = new File("./input").listFiles();
			for (File f:files) {
				System.out.println("File "+f.getName());
				FileValidatorThread fileValidatorThread=new FileValidatorThread(f);
				fileValidatorThread.start();
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
