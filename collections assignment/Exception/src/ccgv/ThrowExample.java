package ccgv;

public class ThrowExample
{
  static void validate(int number) throws Exception{
    if(number <= 0){
      throw new ArithmeticException("Invalid Input");
    }
    else {
      System.out.println("Division is possible.");
    }
  }
  public static void main(String args[]) {
    try {
		validate(0);
	} catch (Exception e) {
//		e.printStackTrace();
			System.out.println(e.getMessage());
	}

  }
}