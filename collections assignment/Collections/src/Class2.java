import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class Class2 {

	public static void main(String[] args) {
		HashSet<String> s=new HashSet<String>();
		s.add("Maahi");
		s.add("hii");
		s.add("Shiva");
		s.add("Krishna");
	
		System.out.println("Size of set is    "+s.size());
		s.add("Krishna"   );
		System.out.println(s.hashCode());
		System.out.println("Size of set is    "+s.size());
	for(String obj : s)
	System.out.println(obj+" respective hascode is "+obj.hashCode());
System.out.println();
//	Iterator itr=s.iterator();
//    while(itr.hasNext()) {
//    	System.out.println(itr.next()+"  repective hashcode is   "+itr.next().hashCode());
//    }
}
}