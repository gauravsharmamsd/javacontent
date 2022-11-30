import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

//import jdk.internal.org.xml.sax.SAXException;

//port jdk.internal.org.xml.sax.SAXException;

class Customer{
	private String fname;
	private String lname;
	private int id;
	private String status;
	private Address Addr;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Address getAdd() {
		return Addr;
	}
	public void setAdd(Address add) {
		Addr = add;
		
	}
	@Override
	public String toString() {
		return "Customer [fname=" + fname + ", lname=" + lname + ", id=" + id + ", status=" + status + "]";
	}
	
	
}
class Address{
	String lane;
	String city;
	String pin;
	
public String getlane() {
		return lane;
	}

	public void setlane(String lane) {
		this.lane = lane;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

@Override
	public String toString() {
		return "Address [lane=" + lane + ", city=" + city + ", pin=" + pin + "]";
	}

public void setStreet(String string) {
	// TODO Auto-generated method stub
	
}
}
public class XMLParser {
	public static void main(String[] args) throws Exception {
		try {
			XMLParser.readAndPrintCustomerData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
static void readAndPrintCustomerData() throws Exception{
	DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
	try {
	DocumentBuilder builder = factory.newDocumentBuilder();
	Document doc = builder.parse("customer.xml");//document is a Tree , Nodes
	Node rootNode = doc.getDocumentElement();
	NodeList customerList=rootNode.getChildNodes();
	for(int j=0;j<customerList.getLength();j++) {
		Node node=customerList.item(j);
		if(node.getNodeType()==Node.ELEMENT_NODE) {
			Element customerNode=(Element)node;
			Customer c=new Customer();
			String fname=customerNode.getAttribute("fname");
			c.setFname(fname);
			String lname=customerNode.getAttribute("lname");
			c.setLname(lname);
			int id=Integer.parseInt(customerNode.getAttribute("id"));
			c.setId(id);
			String status=customerNode.getAttribute("status");
			c.setStatus(status);
			Element addressNode=(Element) customerNode.getElementsByTagName("Address").item(0);
			Address addr=new Address();
			String city=addressNode.getAttribute("city");
			addr.setCity(city);
			
			String pin=addressNode.getAttribute("pin");
			addr.setPin(pin);
			String lane =addressNode.getAttribute("lane");
			addr.setlane(lane);
			c.setAdd(addr);
			System.out.println(c);
		}
	}
	}
	catch(ParserConfigurationException e) {
		e.printStackTrace();
	}
//	catch(SAXException e) {
//		e.printStackTrace();
//	}
}
	
	
	
	
	
	
	
					
		
	
		
	

}
