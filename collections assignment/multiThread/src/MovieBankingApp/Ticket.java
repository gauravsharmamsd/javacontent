package MovieBankingApp;

public class Ticket {
	int TotalTicket;
	Ticket(){
		
	}
public Ticket(int TotalTicket){
	this.TotalTicket=TotalTicket;
		
	}

	public int getBookTicket() {
		return TotalTicket;
	}

	public void setBookTicket(int bookTicket) {
		this.TotalTicket = bookTicket;
	}

}
