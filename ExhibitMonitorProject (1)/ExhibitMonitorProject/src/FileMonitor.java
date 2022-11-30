import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class FileMonitor {
	public static void main(String[] args) throws JAXBException, InterruptedException {
	FileValidatorThread ft=null;
	File file=new File("customer.xml");
	FileFormats fm=null;
		JAXBContext jaxbContext=JAXBContext.newInstance(FileFormats.class);
		Unmarshaller jaxbUnmarshaller=jaxbContext.createUnmarshaller();
		fm= (FileFormats) jaxbUnmarshaller.unmarshal(file);
		
	   System.out.println(fm);
	
		//System.out.println(fm);
	
		while(true) {
			System.out.println("checking if new files have arrived ...");
			File[] files = new File("C:\\Users\\Kapil Kaushik\\Downloads\\ExhibitMonitorProject (1)\\ExhibitMonitorProject\\In").listFiles();
//System.out.println(files[0]);
//System.out.println(files[1]);

				for(File f: files) {
				//f=a.txt
						
			
		System.out.println(f.getName());
		
	ft=new FileValidatorThread(f, fm);
	
	
			ft.start();
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
