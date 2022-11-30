

public interface Bank {
	@EntryLog
	int withdraw(int amount);
}
