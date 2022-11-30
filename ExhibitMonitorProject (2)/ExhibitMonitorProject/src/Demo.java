import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Demo {
	public static void main(String[] args) {
//		FileDescription fd=null;
		FileFormats fd=null;
		File xmlFile = new File("customer.xml"); 
		try {
			JAXBContext jaxbContext=JAXBContext.newInstance(FileFormats.class);
			Unmarshaller jaxbUnmarshaller=jaxbContext.createUnmarshaller();
			 fd = (FileFormats)jaxbUnmarshaller.unmarshal(xmlFile);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println("file name: "+fd.getName()+" time: "+fd.getTimeToArrive()+" out file name: "+fd.getOutfileName());
		System.out.println(fd.fileformats.get(0).getOutfileName());
	}
}
