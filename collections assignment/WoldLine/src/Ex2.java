

import java.util.Scanner;
 
class Student2{
  private int roll;
  private int pin;
  private String fname;
  private String lname;
  private  String city; 
  
  Student2( String fname, String lname,String city,int pin,int roll){
    
    this.fname = fname;
    this.lname = lname;
    this.city = city;
    this.pin = pin;
    this.roll = roll;
    
  }
 
  public void result(){

		System.out.println(fname+" "+ "lname="+lname+" "+"city="+city+" "+"pin="+pin+" "+"roll="+roll+" ");
		    
		  }

  		     
		 	    
  }
class Ex2{
  public static void main(String[] args) {
   
    
    Student2 s1[]= new Student2 [5];
    s1[0]=new Student2("fg","gyj","jhhj",1,2);
    s1[1]=new Student2("fg","gyj","jhhj",1,2);
    s1[2]=new Student2("fg","yhfu","jhhj",1,21);
    s1[3]=new Student2("fg","hf","jhhj",11,2);
    s1[4]=new Student2("fg","gf","jhhj",111,2);
    for(int i=0;i<5;i++) {
    s1[i].result();
    
    }
}
}
