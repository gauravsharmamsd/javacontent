import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class treemap {

	public static void main(String[] args) {
		Set set=new TreeSet();  
		Customers s1=new Customers();
		Customers s2=new Customers("Amir","Mohamaaad","Karachi","pak",24);
		Customers s3=new Customers("Shakib","Al","Dhaka","Bangaldesh",27);
		Customers s4=new Customers("Rashid","Khan","Kabul","Afghanistan",30);

	set.add(s1);
	set.add(s2);
	set.add(s3);
	set.add(s4);
	set.add(s5);
	System.out.println(set);
	System.out.println("------------by city------------");
	Set set2=new TreeSet(new city());  
	set2.addAll( set);
	System.out.println(set2);
	