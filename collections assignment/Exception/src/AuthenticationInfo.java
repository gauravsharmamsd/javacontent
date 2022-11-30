
import java.util.Scanner;

public class AuthenticationInfo {
	static String[][] userIdPasswd = new String[2][100];
	static int counter=0;
	public void add(String userId, String pwd) throws DuplicateUserIdException,InvalidPasswordException {
		if(search(userId)>=0)
			//return "Err-101";
			throw new DuplicateUserIdException("DUPLICATE !!!!");
		else if(pwd.length()<6)
			//return "Err-102";
			throw new InvalidPasswordException("Min length of password must be 6 chars");
		userIdPasswd[0][counter]=userId;
		userIdPasswd[1][counter++]=pwd;	
	}
public void check(String uid,String pwd) throws InvalidUserpwdException,InvalidUserIDException {
	
	if(!uid.equals(userId)))
		throw new InvalidUserIDException("user id is not in play");
	if(!uid.equals(userIdPasswd[1][counter++]))
		throw new InvalidUserpwdException("pwd is not in match");
	}

	

	private static int search(String userId) {
		for(int j=0; j< counter;j++) {
			if(userIdPasswd[0][j]!= null)
				if(userIdPasswd[0][j].equals(userId))
					return j;
		}
		return -1;
	}

}





