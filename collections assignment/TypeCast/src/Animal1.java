class Animal1 { }  
  
class Dog3 extends Animal1 {
	
	
  static void method(Animal1 a) {  
    if(a instanceof Dog3){  
       Dog3 d=(Dog3)a;
       System.out.println("ok downcasting performed");  
    }  
  }  
   
  public static void main (String [] args) {  
    Animal1 a=new Dog3();  
    Dog3.method(a);  
  }  
    
 }  