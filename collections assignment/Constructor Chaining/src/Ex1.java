
public class Ex1 {

	public static void main(String[] args) {
		Ex1 e=new Ex1();
	}
	
		Ex1(){
					this(5);
		System.out.println("Default constructor");
		
	}
	Ex1(int b){
		this(5,6.0f);
		System.out.println("Parameterized constructor");
	}
	Ex1(int b,float d){
		System.out.println("Another Parameterized constructor");
	}

}
