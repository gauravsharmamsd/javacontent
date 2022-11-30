package search_algo;
class Shape {
 void display() {
      System.out.println("Inside display");
   }
}
class Rectangle extends Shape {
   public void area() {
      System.out.println("Inside area");
   }
}
class trapoid extends Shape {
	   public void para() {
	      System.out.println("Inside para");
	   }
	}

public class Inheriatence {


   public static void main(String[] arguments) {
      Rectangle rect = new Rectangle();
      rect.display();
      rect.area();
     trapoid tr = new trapoid();
      tr.display();
  //
     tr.para();
   }
}



