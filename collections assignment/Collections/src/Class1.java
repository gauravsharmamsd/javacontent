import java.util.*;
import java.util.function.Consumer;
//import java.util.function.Consumer;

public class Class1 {
public static void main(String[] args) {
	List al=new Vector();
	al.add("Hello");
	al.add("Maahi");
	al.add(100);
	int no =(int)al.get(2);
	System.out.println("3rd element is    "+no);
	al.add(2,500);
	no=(int)al.get(2);
	System.out.println("3rd element is   "+no);
	no =(int)al.get(3);
	System.out.println("4th elementt is  "+no);
	System.out.println("Method 1 for loop");
	for(int i=0;i<al.size();i++) {
	System.out.println(al.get(i));
	}
	System.out.println("_---------------------------------------------------------------------");
	
	System.out.println("Method 2 forenhanced loop");
	for(Object o: al) {
	System.out.println(o);
	}
	System.out.println("_---------------------------------------------------------------------");
	System.out.println("Method 3 for iterator");
	Iterator i=al.listIterator();
	while(i.hasNext()){
	System.out.println(i.next());
	}
	System.out.println("_---------------------------------------------------------------------");
	
	System.out.println("Method 4for lambda");
	Consumer c=(Object o)->{	
		System.out.println(o);
	
	};
	al.forEach(c);
	
	
	
}

}
