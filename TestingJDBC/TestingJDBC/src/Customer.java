
public class Customer {
	String name;
	Address addr;
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Customer() {
		super();
	}
	public Customer(String name, Address addr, int id) {
		super();
		this.name = name;
		this.addr = addr;
		this.id = id;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
