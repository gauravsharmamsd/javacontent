
public class Test {

	public static void main(String[] args) {
		//named class metthod
		NamedClassInterFace n=new NamedClassInterFace();
		n.m1(1, 02, "Maahive");
		names  n2=new names  ();
		n2.m2("Sunil");
		namesss m3=new namesss();
	int s2=m3.getInt();
	System.out.println(s2);
	
	
	
	//Lambdaclass metthod
	
	
		InterFaceForLambda iz=(i, j, s)->{
			System.out.println(i+"  "+j+" "+s);
	};
	
iz.m1(5, 6, "Babae");

	InterFaceForLambda2 izz=( s)->{
		System.out.println(s);
};

izz.m2("maahi");
InterFaceForLambda3 izzz=()-> 5;{

	
};

izzz.getInt();
}

}	