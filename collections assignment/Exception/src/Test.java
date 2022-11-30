import java.util.Scanner;

public class Test {
	static String[][] userIdPasswd=new String[2][100];
	static {
		for(int i=0;i<=userIdPasswd.length-1;i++) {
			for(int j=0;j<userIdPasswd[i].length;j++) {
				if(i==0)
					userIdPasswd[i][j]="gaurav"+7;
				if(i==1)
					userIdPasswd[i][j]="passwd"+11;			
			}	
		}
	}
	public static void main(String[] args) {
		//ask user to enter userId
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter userId");
		String userid=sc.next();
		//display passwd
		System.out.println(getPasswd(userid));
	}
	static String getPasswd(String userid) {
		int index=search(userid);
		if(index>=0)
			return userIdPasswd[1][index];
		return "Not Found";
	}
	
	private static int search(String userId) {
		for(int j=0;j<userIdPasswd[0].length;j++) {
			if(userIdPasswd[0][j].equals(userId))
				return j;
		}
		return -1;
		}
	}
