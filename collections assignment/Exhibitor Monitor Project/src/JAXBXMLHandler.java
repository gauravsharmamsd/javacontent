
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import com.theopentutorials.jaxb.to.Employee;
 
public class JAXBXMLHandler {
 
    
 /*   public static void marshal(Customer c1)
            throws IOException, JAXBException {
    			JAXBContext context =JAXBContext.newInstance(Customer.class);
		
		    		Marshaller marshaller=	context.createMarshaller();
		    		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    		marshaller.marshal(c1, System.out);
		
	File file=new File("Customer.xml");
	marshaller.marshal(c1, file);

	
		
	}*/
//
//	//
    public static Customer unmarshal() throws JAXBException {
    	   JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
	    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
  		File file=new File("Cust.xml");
  		Customer cust =(Customer) jaxbUnmarshaller.unmarshal((file));
   	 
       return cust;
    }
 

	public static void marshal(Object writeFile) 
		 throws IOException, JAXBException {
 			JAXBContext context =JAXBContext.newInstance(Customer.class);
		
		    		Marshaller marshaller=	context.createMarshaller();
		    		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    		marshaller.marshal(writeFile, System.out);
		
	File file=new File("Cust.xml");
	marshaller.marshal(writeFile, file);

	
		
	}

	
}