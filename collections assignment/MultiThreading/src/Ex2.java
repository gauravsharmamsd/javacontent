public class Ex2 extends Thread{
	public void run() {
		System.out.println("I love u");
	}



	public static void main(String[] args) {
		Ex2 t= new Ex2();
		t.start();
		// TODO Auto-generated method stub

	}

}
