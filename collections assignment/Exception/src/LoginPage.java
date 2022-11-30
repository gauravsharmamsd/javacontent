
public class LoginPage {
	
	AuthenticationInfo auth = new AuthenticationInfo();
	void  register(String userId, String pwd) throws DuplicateUserIdException, InvalidPasswordException{		
		auth.add(userId,pwd);			
	}
	
	public void check(String uid, String pwd)throws  InvalidUserpwdException, InvalidUserIDException{ 
		auth.check(uid ,pwd);
		
		//Go to AuthenticationInfor object and check if uid and pwd are valid.
		//if either uid or pwd r invalid, then throw AuthFailedException.
		
	}

	//public void check(String uid, String pwd) {
		// TODO Auto-generated method stub
		
	}


