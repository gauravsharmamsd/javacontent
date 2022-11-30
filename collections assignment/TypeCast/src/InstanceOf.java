class Bird{
	void sing() {
		System.out.println("Singing");
	}
}
class Eagle extends Bird{
	

	@Override
	void sing() {
			System.out.println("Singing+dancing");
	}
}
public class InstanceOf {
public static void main(String args[]) {
	Object e=(Object)new Bird();
((Bird) e).sing();
	System.out.println(e instanceof Bird);
	InstanceOf i=new InstanceOf();
	System.out.println(i instanceof InstanceOf);
}


	
	// TODO Auto-generated method stub
	

}
