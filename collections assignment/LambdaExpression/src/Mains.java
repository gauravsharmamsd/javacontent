import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Mains {

	public static void main(String[] args) {
		Map<Customers,Addresss> maps=new HashMap<>();
		Addresss addr1=new Addresss(245301, "Hapur");
		Customers c1=new Customers("Vishal", "Sharma", addr1, 1);
		
		Addresss addr2=new Addresss(201009, "Ghazabad");
		Customers c2=new Customers("Rituuraj", "Kaushik", addr2, 4);
		
		Addresss addr3=new Addresss(234567, "Meerut");
		Customers c3=new Customers("Suraj", "Vashistha", addr3, 3);
		
         maps.put(c3, addr3);
         maps.put(c2, addr2);
         maps.put(c1, addr1);
         System.out.println("______________Hashmap___________________");
        System.out.println(maps);
        System.out.println("-----------------------------");
		  Set<Customers>Keyss =maps.keySet();
		for(Customers key1: Keyss) {
			System.out.println(key1);
			
		}
		System.out.println("-------------sorting byn fname-----------");
		Map<Customers,Addresss>map1=new TreeMap(new sortByFname());
		map1.putAll(maps);
	
		  Set<Customers>Keyss1 =map1.keySet();
			for(Customers key11: Keyss1) {
				System.out.println(key11);
				
			}
			System.out.println("-------------sorting byn lname-----------");
			Map<Customers,Addresss>map11=new TreeMap(new sortByLname());
			map11.putAll(maps);
		
			  Set<Customers>Keysss1 =map11.keySet();
				for(Customers key111: Keysss1) {
					System.out.println(key111);
					
				}
			System.out.println("-------------sorting byn cite-----------");
			Map<Customers,Addresss>map2=new TreeMap(new sortByCity());
			map2.putAll(maps);
			
			  Set<Customers>Ke1 =map2.keySet();
				for(Customers ke: Ke1) {
					System.out.println(ke);
					
				}
				System.out.println("-------------sorting byn pin-----------");
				Map<Customers,Addresss>map3=new TreeMap(new sortByPin());
				map3.putAll(maps);
				  Set<Customers>Kee11 =map3.keySet();
					for(Customers keek: Kee11) {
						System.out.println(keek);
						
					}
					System.out.println("-------------sorting byn Id-----------");
					Map<Customers,Addresss>map33=new TreeMap(new sortByID());
					map33.putAll(maps);
					
					  Set<Customers>Kans =map33.keySet();
						for(Customers ks: Kans) {
							System.out.println(ks);
							
						}
				
	}
	

}
