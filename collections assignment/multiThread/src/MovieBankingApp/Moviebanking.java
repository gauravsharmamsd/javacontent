package MovieBankingApp;

public class Moviebanking {
static Ticket t=new Ticket(10);
 synchronized int BookTicket(int Book) {
	
		  if(Book<=t.getBookTicket()) {
			System.out.println(Thread.currentThread().getName()  + "  Booking is successful "+ Book+  " seat succesfully Allocated");
			 int reaminingTicket =t.getBookTicket()-Book;
		System.out.println("Remaining Ticket is just    "+reaminingTicket);
	 t.setBookTicket(reaminingTicket);
		}else
			
		{System.out.println("Sorry seat can not be booked");

			System.out.println("Insufficient seat Seat is only +"+t.getBookTicket());

			
		}
		return t.getBookTicket();
	
	   
}
}