

import java.util.Scanner;
 class Address{
	  public int pin;
	  public String city; 
 }
 
class Student1{
  public int roll;

  public String fname;
  public String lname;
  Address addr;
  
  
  Student1( String fname, String lname,String city,int pin,int roll){
    
    this.fname = fname;
    this.lname = lname;
 addr.city=city;
 addr.pin=pin;
    this.roll = roll;
    
  }

  
 
  public String toString(){
    return "{roll: "+this.roll+", fname: "+this.fname+",lname: "+this.lname+", city: "+this.city+",pin"+this.pin+ " }";
  }
  
}
 
class Ex4{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    
    Student1 s1[]= new Student1[5];
 
    System.out.println("Enter  students details");    
    for(int i=0; i<5; i++){

      Student1 s = new Student1(in.next(),in.next(),in.next(),in.nextInt(),in.nextInt());
    
      s1[i] = s;
    }
 
    System.out.println("Students details are:");    
    for(int i=0; i<5; i++){
   
      System.out.println(s1[i]);
    }
 
  }
}
