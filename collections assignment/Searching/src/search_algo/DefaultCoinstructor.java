package search_algo;
public class DefaultCoinstructor {
	public void run(){
	System.out.print(" im running");
}
	 DefaultCoinstructor(int a){
			System.out.print(" im not  running");
	 
	 }


	   public static void main(String[] arguments) {
		   int n=5;
		   DefaultCoinstructor  rect = new  DefaultCoinstructor ( n);
rect.run();
}
}