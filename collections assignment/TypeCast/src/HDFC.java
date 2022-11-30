class HDFC implements Bank{

	@Override
	public double calculateAmountAfterInterest(int amount, int duration) {
		
		return  (amount*1.5*duration);
	}
	 
 }