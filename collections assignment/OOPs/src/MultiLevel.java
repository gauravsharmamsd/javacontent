
	class A {
		   public void display() {
		      System.out.println("Inside the display");
		   }
		}
		class B extends A{
		   public void area() {
		      System.out.println("Inside area");
		   }
		}
		public class MultiLevel {
		   public static void main(String[] arguments) {
		    B rect = new B();
		      rect.display();
		      rect.area();
		   }
		}


