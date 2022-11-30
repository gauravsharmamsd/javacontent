	

 
import java.io.File;
import java.io.IOException;
import javax.xml.bind.JAXBException;
import com.theopentutorials.jaxb.to.Address;
import com.theopentutorials.jaxb.to.Employee;
import com.theopentutorials.jaxb.xml.JAXBXMLHandler;
 
public class JAXBDemo {
    public static void main(String[] args) throws IOException, JAXBException {
 
        Address address = new Address();
        address.setStreet("2163, 1st Avenue");
        address.setCity("Peoria");
        address.setState("Illinois");
        address.setZip(61606);
         
        Employee employee = new Employee();
        employee.setAddress(address);
        employee.setDepartment("test");
        employee.setName("Akash");
        employee.setId(5);
         
       
            //Marshalling: Writing Java object to XML file
            JAXBXMLHandler.marshal(employee);
         
            //Unmarshalling: Converting XML content to Java objects
            Employee employee2 = JAXBXMLHandler.unmarshal();
            System.out.println(employee2);  
       
    }
}