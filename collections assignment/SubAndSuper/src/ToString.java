import java.util.Scanner;

public class ToString {
private static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		Student sp[]=new Student[4];
	
		Student s=new Student();
		Student s1=new Student("maahi",1);
		String fname=sc.next();
		s.setName(fname);
		int sid=sc.nextInt();
		s.setSid(sid);
		sp[0]=s;
		sp[1]=s;
		
		System.out.println(sp+" "+s1);
		// TODO Auto-generated method stub

	}

}
