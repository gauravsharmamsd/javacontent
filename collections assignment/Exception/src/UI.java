import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class UI {

	static LoginPage login = new LoginPage();
	static Scanner sc = new Scanner(System.in);
	static int i=0;
	public static void main(String[] args) throws FileNotFoundException, IOException, InvalidUserpwdException, InvalidUserIDException {
		while(i++ < 1) {
			System.out.println("Enter your userId");
			String uid = sc.next();
			System.out.println("Enter your pwd");
			String pwd = sc.next();
			try {
				login.register(uid,pwd);
				System.out.println("Successfuly registered");
			}catch(DuplicateUserIdException e) {
				System.out.println(e.getMessage());
			}catch(InvalidPasswordException e) {
				System.out.println(e.getMessage());
			}
		}
			
			while(i++ < 3) {
				System.out.println("Enter your userId for verification");
				String uid = sc.next();
				System.out.println("Enter your pwd for verification");
				String pwd = sc.next();
			try {
				login.check (uid, pwd);
				System.out.println("Successfuly verified");
			}catch(InvalidUserIDException e) {
				System.out.println(e.getMessage());
			}catch(InvalidUserpwdException e) {
				System.out.println(e.getMessage());
			}
			

		}
	}
	
	private static void showMenu() {
		System.out.println("Menu #1");
		System.out.println("Menu #2");
		System.out.println("Menu #3");
		System.out.println("Menu #4");

	}

}

