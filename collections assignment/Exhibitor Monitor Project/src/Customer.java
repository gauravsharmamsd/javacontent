import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.xml.bind.annotation.*;
 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "customer")

public class Customer {
	 @XmlAttribute
	String name;
	 Address add;

	 int order_value;
 LocalTime lt;
	private File file;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public int getOrder_value() {
		return order_value;
	}

	public void setOrder_value(int order_value) {
		this.order_value = order_value;
	}

	public Customer(File file,LocalTime lt,String name, Address add, int order_value) {
		super();
		this.file=file;
		this.name = name;
		this.add = add;
		this.order_value = order_value;
		this.lt=lt;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public LocalTime getLt() {
		return lt;
	}

	public void setLt(LocalTime lt) {
		this.lt = lt;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", add=" + add + ", order_value=" + order_value + ", lt=" + lt + ", file="
				+ file + "]";
	}
}
