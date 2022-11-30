import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		Map<Customer, Address> map = new HashMap();		
		Customer c1 = new Customer();
		c1.setId(1);
		c1.setName("XYZ");
		Address addr1 = new Address();
		addr1.setCity("Pune");
		addr1.setPin(411004);
		Customer c2 = new Customer();
		c2.setId(1);
		c2.setName("PQR");
		Address addr2 = new Address();
		addr2.setCity("Mumbai");
		addr2.setPin(411000);
		map.put(c1, addr1);
		System.out.println("_________1____________");
		Set<Customer>Keys =map.keySet();
		for(Customer key: Keys) {
			System.out.println(key);
		System.out.println(map.get(key));
		}
		System.out.println("First Entry was ");
		Set<Map.Entry<Customer, Address>> entries = map.entrySet();//entrySet() method returns Set Key-Value Pairs( set of Entries)
		for(Map.Entry entry: entries) {
			System.out.println("Key is "+entry.getKey());
			System.out.println("Value is "+entry.getValue());
		}	
		map.put(c2, addr2);
		System.out.println("________2_____________");
		Set<Customer>  keys1 = map.keySet();
		for(Customer key : keys1) {
		System.out.println("Key "+key);
		System.out.println("Value "+map.get(key));
	}
		System.out.println(map.size());
		System.out.println("Now second entry replaces first because c1.equals(c2) is true");
		Set<Map.Entry<Customer, Address>> entries2 = map.entrySet();
		for(Map.Entry entry: entries2) {
			System.out.println("Key is "+entry.getKey());
			System.out.println("Value is "+entry.getValue());
		}
	}

}



