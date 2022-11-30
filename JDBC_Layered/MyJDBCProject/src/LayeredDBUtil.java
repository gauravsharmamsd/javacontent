
public class LayeredDBUtil {

	static Repository repo = new CustomerRepository();
	public static void main(String[] args) {
		Customer c1 = new Customer("A",new Address("Pune",411004),1);
		
		repo.save(c1);
		Customer c2 = (Customer) repo.findById(1);
		System.out.println(c2);
	}
}



