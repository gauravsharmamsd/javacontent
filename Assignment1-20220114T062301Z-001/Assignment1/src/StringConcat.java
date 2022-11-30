import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
		concatAndPrintUsingHardCoding();
		concatAndPrintUsingScanner();
	}

	private static void concatAndPrintUsingScanner() {
		String[] stringArray; //Declaration does not allocate memeory
		System.out.println("How many Strings ??");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		stringArray= new String[no];//Now We defined array of size of no
		                           //Now memory will be allocated.
		for(int i=0; i< no; i++) {
		  // System.out.println("Enter a String ");
		   stringArray[i]=sc.nextLine();
		}
		String s = concat(stringArray);
		System.out.println(s);	
	}

	private static void concatAndPrintUsingHardCoding() {
		String[] stringArray; //Declaration does not allocate memeory
		stringArray= new String[5];//Now We defined array of size 5
		                           //Now memory will be allocated.
		
		stringArray[0]="Bharat";
		stringArray[1]="Mata";
		stringArray[2]="Ki";
		stringArray[3]="Jai";
		stringArray[4]="!!!";
		String s = concat(stringArray);
		System.out.println(s);
		
	}
	
	private static String concat(String[] stringArray) {
        StringBuilder s= new StringBuilder();	
		for(int i=0; i<stringArray.length; i++) {
			s.append(stringArray[i]);
		}
		return s.toString();
	}

}
