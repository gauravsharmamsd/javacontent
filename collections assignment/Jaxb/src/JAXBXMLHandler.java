
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBXMLHandler {

	// Export: Marshalling
	public static void marshal(Student student) throws IOException, JAXBException {

		// Cretae jaxbcontent object
		JAXBContext context = JAXBContext.newInstance(Student.class);
		// create Marshaller object using jaxcontent object
		Marshaller marshaller = context.createMarshaller();
		//marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		StringWriter stringWriter=new StringWriter();
		
		marshaller.marshal(student, stringWriter);
		System.out.println(stringWriter.toString());
		// call marshall from marshaller
		
//		File file = new File("stu.xml");
//		marshaller.marshal(student, file);

	}

	// Import: Unmarshalling
	public static Student unmarshal() throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		StringReader reader = new StringReader("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><student fname=\"Aklu\"><lname>kumar</lname><age>22</age><rollNo>11</rollNo><add><city>AAAAA</city><pincode>1</pincode><state>up</state></add></student>\r\n"
				+ "");
	//	File file = new File("stu.xml");
		Student st2 = (Student) jaxbUnmarshaller.unmarshal((reader));

		return st2;
	}

}