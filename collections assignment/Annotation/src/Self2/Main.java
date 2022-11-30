package Self2;

public class Main {

	public static void main(String[] args) {
	Animal a=new Animal();
//	a.A();
//	a.B();
	Animal c=GetObj.getObject();
	c.A(); 
	System.out.println("________________________");
	c.B();

	}

}
