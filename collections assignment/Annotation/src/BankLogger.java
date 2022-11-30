


import java.lang.annotation.Annotation;

public class BankLogger implements Bank{
     private Bank bank;
     public BankLogger(Bank bank){
    	
    	 this.bank = bank;
    	 System.out.println("OBJ   "+bank.getClass().getName());
    	 //This could be HDFC or SBI or any other Bank
     }
     
	@Override
	public int withdraw(int amount)  {
		System.out.println(amount);
		Class c = bank.getClass();
		try {
			Annotation annotation = c.getMethod("withdraw", int.class).getDeclaredAnnotation(EntryLog.class);
			if(annotation != null) {
				System.out.println("Entering method withdraw of "+bank.getClass().getName());
			}
			bank.withdraw(100);
			System.out.println(bank.getClass().getName());
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
