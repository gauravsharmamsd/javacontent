
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

public class Main {
	public static void main(String[] args) throws IOException, JAXBException {

		Address add11 = new Address();
		add11.setCity("AAAAA");
		add11.setPincode(1);
		add11.setState("up");

		Student s = new Student();
		s.setAge(22);
		s.setFname("Gaurav");
		s.setLname("kaushik");
		s.setRollNo(12);
		s.setAdd(add11);
		JAXBXMLHandler.marshal(s);
		JAXBXMLHandler.unmarshal();

	}

}
