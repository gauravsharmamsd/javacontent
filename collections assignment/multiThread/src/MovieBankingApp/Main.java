package MovieBankingApp;
class BookTheatreSeat extends Thread{
	int Book;
	static  Moviebanking mb=new Moviebanking();
	public BookTheatreSeat(int i) {
		this.Book=i;
	}
	public void run() {
		System.out.println("Current thread   "+getName());
		int x=mb.BookTicket(Book);
	
	}
}
public class Main {

	public static void main(String[] args) throws InterruptedException {

		BookTheatreSeat b1=new BookTheatreSeat(7);
		BookTheatreSeat b2=new BookTheatreSeat(3);
		b1.setName("Thread 0");
		b2.setName("Thread 1");
		b1.start();
		b2.start();
		
		
		

	}

}
