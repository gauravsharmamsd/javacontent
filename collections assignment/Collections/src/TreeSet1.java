import java.util.*;

public class TreeSet1 {

	public static void main(String[] args) {
		Set set=new TreeSet();  
		Student1 s1=new Student1("Aash","B","Hapur","India",21);
		Student1 s2=new Student1("Amir","Mohamaaad","Karachi","pak",24);
		Student1 s3=new Student1("Shakib","Al","Dhaka","Bangaldesh",27);
		Student1 s4=new Student1("Rashid","Khan","Kabul","Afghanistan",30);
		Student1 s5=new Student1("Maxweell","George","Melbourne","Australia",212);
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
	
	System.out.println("-----------by country-------------");
	Set set3=new TreeSet(new country());  
	set3.addAll( set);
	System.out.println(set3);

	System.out.println("-----------byage-------------");
	Set set4=new TreeSet(new age());  
	set4.addAll( set);
	System.out.println(set4);
	
	System.out.println("-----------byfname-------------");
	Set set5=new TreeSet(new fname());  
	set5.addAll( set);
	System.out.println(set5);
	
	System.out.println("-----------bylname-------------");
	Set set6=new TreeSet(new lname());  
	set6.addAll( set);
	System.out.println(set6);
	
	}


	}


