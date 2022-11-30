package Bank;

public class TestAtm {

	public static void main(String[] args) {
	Thread t1=new ATM();
	t1.setName("Son");
	Thread t2=new ATM();
	t2.setName("Father");
	t1.start();
	t2.start();
	

	}

}
