package Practise;

public class Test {

	public static void main(String[] args) {
		Main m=new Main();
		m.display();
	}
}
	class Main {

		  
		  public void display() {
		    System.out.println("Calculating Method execution time:");
		  
		    Objeect oo=new Objeect();
		    long start = System.nanoTime();
		    oo.display();

		  
		    long end = System.nanoTime();

		    // execution time
		    long execution = end - start;
		    System.out.println("Execution time: " + execution + " nanoseconds");
		  }
		class Objeect{
			int display() {
			int a=3;
			int b=9;
			return a+b+a+b/a;
		}}

}
