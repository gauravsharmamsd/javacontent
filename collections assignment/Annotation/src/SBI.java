
public class SBI implements Bank{
	@Override
	@EntryLog
		public int withdraw(int amount) {
		System.out.println("Inside SBI Withdraw Method");
		return amount-10;
	}

}
