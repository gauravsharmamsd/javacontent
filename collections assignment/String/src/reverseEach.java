import java.util.Scanner;

public class reverseEach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s =" ";
		String st =sc.nextLine();
		for(int x=st.length()-1;x>=0;x--) {
			s=s+st.charAt(x);
		}
		System.out.println(s);
		
	

}}
