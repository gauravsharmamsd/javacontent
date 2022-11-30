
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import com.theopentutorials.jaxb.to.Employee;
 
public class JAXBXMLHandler {
 
    // Export: Marshalling
    public static void marshal(Employee employee)
            throws IOException, JAXBException {
    	 
 
    	//Cretae jaxbcontent object
		JAXBContext context =JAXBContext.newInstance(Employee.class);
		//create Marshaller object using jaxcontent object
		    		Marshaller marshaller=	context.createMarshaller();
		    		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    		marshaller.marshal(employee, System.out);
		//call marshall from marshaller
	File file=new File("emp1.xml");
	marshaller.marshal(employee, file);

	
		
	}

	// Import: Unmarshalling
    public static Employee unmarshal() throws JAXBException {
    	   JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
   	    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
   		File file=new File("emp1.xml");
   	       Employee employee2 =(Employee) jaxbUnmarshaller.unmarshal((file));
   	 
        return employee2;
    }
 
}