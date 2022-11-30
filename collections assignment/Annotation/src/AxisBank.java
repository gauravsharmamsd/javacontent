
public class AxisBank implements Bank {

	@Override
	@EntryLog
	public int withdraw(int amount) {
		System.out.println("Withdraw of Axis");
		return 0;
	}

}
