import java.util.HashMap;
import java.util.Map;

public class Coll {

	public static void main(String[] args) {
		Map<String,Integer> map= new HashMap<String,Integer>();
        map.put("Maahi", 9);
        map.put("Shiva", 91);
        System.out.println(map.get("Shiva"));
        System.out.println(map.containsValue(9));
	}

}