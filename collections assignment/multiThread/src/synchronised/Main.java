package synchronised;

public class Main {

	public static void main(String[] args) {
		Test t=new Test();
		Mediar t1=new Mediar(t,"maahi");
		Mediar t2=new Mediar(t,"yuvi");
	
		t1.start();
		t2.start();


	}

}
