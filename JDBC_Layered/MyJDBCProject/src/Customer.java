public class Customer{
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", addr=" + addr + ", id=" + id + "]";
	}
	public Customer(String name, Address addr, int id) {
		super();
		this.name = name;
		this.addr = addr;
		this.id = id;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	String name;
	Address addr;
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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