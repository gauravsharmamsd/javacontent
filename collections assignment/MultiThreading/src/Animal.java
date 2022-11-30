public class Animal{
 
	void A() {
		System.out.println("Abc");
	
 }
 class dog extends Animal{
	void B() {
		System.out.println("kjhk.");
	
 }}

	public static void main(String[] args) {
		Animal a =new Animal();
		a.A();
		dog d =new dog();
		d.B();
		
		// TODO Auto-generated method stub

	}

}}
