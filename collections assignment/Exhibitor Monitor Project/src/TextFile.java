import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import snippet.Exhibitor;
import snippet.collections;

public class TextFile {
	static Customer s=new Customer();
	static PreparedStatement ps=null;
	static Scanner sc =new Scanner(System.in);
	static ConnectorClass c=new ConnectorClass();
public static void main(String[] args) throws Exception {
	
	List<Customer> al=new ArrayList<Customer>();
	JAXBXMLHandler j=new JAXBXMLHandler();
	while(true) {
	System.out.println("Enter pin");
	int pin=sc.nextInt();
	System.out.println("Enter city");
	String city =sc.next();
	Address add1=new Address(pin,city);
	System.out.println("Enter name");
	String name=sc.next();
	System.out.println("Enter order value");
	int order_val=sc.nextInt();
	System.out.println("Enter the file name");
	String fileName=sc.next();
	File file=new File(fileName);
	
	LocalTime present=LocalTime.now();
		String bf1="12:30:00";
	LocalTime bf3 = LocalTime.parse(bf1);
	System.out.println(bf3);
	
	
   //  String time=sc.next();  //default format: hh:mm:ss 
	//LocalTime lt=LocalTime.parse(time); 
	Customer c11=new Customer(file,bf3,name,add1,order_val);
	al.add(c11);

	//System.out.println(al);   
  	WriteFile.writeFile(al,file);
  	
	//ReadFile.readFile("file");
	JAXBXMLHandler.marshal(c11);
	s = JAXBXMLHandler.unmarshal();
	System.out.println(s);  
	System.out.println("prss y ?n to add  more");
	String y=sc.next();
	if(y.equals("n")) {
		break;
	
	}


	}}}

	








