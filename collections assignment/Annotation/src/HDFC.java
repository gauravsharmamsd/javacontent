
public class HDFC implements Bank{
	@Override
	@EntryLog
	public int withdraw(int amount) {
		System.out.println("Inside HDFC Withdraw Method");
		return amount-1;
	}

}
