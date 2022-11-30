class AXIS implements Bank{

	@Override
	public double calculateAmountAfterInterest(int amount, int duration) {
		
		return  (amount*3.9*duration);
	}
	 
 }