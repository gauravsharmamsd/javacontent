



import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class TestJAXB {

	public static void main(String[] args) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(A.class);
		Marshaller marshaller = context.createMarshaller(); //Marshaller is a converter of Java Object to XML
        Employee e = new Employee();
        e.setFname("Vivek");
        e.setLname("Kulkarni");
        e.setDesignation("Developer");
        Department dept = new Department();
        dept.setId(1234);
        dept.setLocation("Pune");
        dept.setName("Design");
        e.setDept(dept);
//        e.setDomain(Arrays.asList("Insurance","Logistics","Healthcare"));
//        e.setId(2233);
        Employee e2 = new Employee();
        e2.setFname("Vivek");
        e2.setLname("Kulkarni");
        e2.setDesignation("Developer");
        Department dept2 = new Department();
        dept2.setId(1234);
        dept2.setLocation("Pune");
        dept2.setName("Design");
        e2.setDept(dept2);
//        e2.setDomain(Arrays.asList("Insurance","Logistics","Healthcare"));
//        e2.setId(2233);
        A a = new A();
        List<Employee> employees = new ArrayList();
        employees.add(e);
        employees.add(e2);
        a.setEmployees(employees);
        
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(a,new File("employee.xml"));
        JAXBContext jaxbContext = JAXBContext.newInstance(Employe.class);
	    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	     
	    Employe employee2 =(Employe) jaxbUnmarshaller.unmarshal(new File("employee.xml"));
	    System.out.println(employee2);
	}
	}


