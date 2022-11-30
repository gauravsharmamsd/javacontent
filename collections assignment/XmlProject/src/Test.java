import java.util.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

class Employee{
	private String fname;
	private String lname;
	private Department dept;
	private String designation;
	private List<String>projects;
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
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public List<String> getProjects() {
		return projects;
	}
	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", dept=" + dept + ", designation=" + designation
				+ ", projects=" + projects + "]";
	}
	
	
}
class Department{
	private String name;
	private String Location;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Department [name=" + name + ", Location=" + Location + ", id=" + id + "]";
	}
	
}
public class Test {
	public class XMLParser {
		public static void main(String[] args) throws Exception {
			try {
				XMLParser.readAndPrintEmployeeData();
			} catch (Exception e) {
								e.printStackTrace();
			}
		}
	static void readAndPrintEmployeeData() throws Exception{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
		try {
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse("Employee.xml");
		Node rootNode = doc.getDocumentElement();
		NodeList EmployeeList=rootNode.getChildNodes();
		for(int j=0;j<EmployeeList.getLength();j++) {
			Node node=EmployeeList.item(j);
			if(node.getNodeType()==Node.ELEMENT_NODE) {
				Element employeeNode=(Element)node;
				Employee e=new Employee();
				String fname=employeeNode.getAttribute("fname");
				e.setFname(fname);
				String lname=employeeNode.getAttribute("lname");
				e.setLname(lname);
				String designation=employeeNode.getAttribute("designation");
				e.setDesignation(designation);
			Element departmentNode=(Element) departmentNode.getElementsByTagName("department").item(0);
			Department d=new Department();
				String name=departmentNode.getAttribute("department");
			d.setName(name);
				
				String location=departmentNode.getAttribute("location");
			d.setLocation(location);;
				int id=Integer.parseInt(departmentNode.getAttribute("location"));
				d.setId(id);
				Element projectNode=(Element) projectNode.getElementsByTagName("projects").item(0);
				Element domainNode;
				for(int i=0;i<2;i++) {
			 domainNode=(Element) domainNode.getElementsByTagName("domain").item(i);
			}
				String project=domainNode.getTextContent();
				ArrayList<String> al=new ArrayList<String>();
				String p1=al.add(Arrays.asList("kjhkj),"gvjhb")
				e.setProjects(p1);
				System.out.println(c);
			}
		}
		}
		catch(ParserConfigurationException e) {
			e.printStackTrace();
		}

}
