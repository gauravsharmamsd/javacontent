import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Test1 {

	public static void main(String[] args) throws JAXBException {
	//converting java object into xml
		Employe e=new Employe();
		Departmentment d=new Departmentment();
		e.setEmpNo(1);
		e.setEname("Maahi");
		e.setSalary(1000);
		d.setId(12);
		d.setName("rahul");
		//Cretae jaxbcontent object
		JAXBContext context =JAXBContext.newInstance(Employe.class);
		//create Marshaller object using jaxcontent object
		
	Marshaller marshaller=	context.createMarshaller();
		//call marshall from marshaller
	File file=new File("emp.xml");
	
	  marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	marshaller.marshal(e, file);
	
	System.out.println("done*****************************");

	    JAXBContext jaxbContext = JAXBContext.newInstance(Employe.class);
	    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	     
	    Employe employee2 =(Employe) jaxbUnmarshaller.unmarshal(new File("emp.xml"));
	    System.out.println(employee2);
	}
	}


