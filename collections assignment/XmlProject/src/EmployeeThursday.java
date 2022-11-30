
 
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "employee")
public class EmployeeThursday {
 
    @XmlAttribute
    private int id;
    private String name;
    private String department;
    private Addresst address;
     
    //Must have no-argument constructor
    public EmployeeThursday() { }
     
    public EmployeeThursday(int id, String name, String department, Addresst address2) {
        super();
        this.id = id;
        this.name = name;
        this.department = department;
        this.address = address2;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public Addresst getAddress() {
        return address;
    }
    public void setAddress(Addresst address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department="
                + department + ", address=" + address + "]";
    }   
}