import java.util.Scanner;

public class Main {
	static Scanner sc=new Scanner(System.in);
	static String abc=sc.next();
	static Polygon p= (Polygon) ObjectCreation.get(abc);
	
	  public static void main(String[] args) {
	 	int l=sc.nextInt();
	int h=sc.nextInt();
	int res= p.getArea(l, h);
	  System.out.println(res);
	  }
	}
	
		
	
	
	
		