package arraylist;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Method m = new Method();
		System.out.println("enter the string");
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			String y = sc.next();
			String z = sc.next();
			String s = Name(y, z);
			System.out.println("Values of add method:" + m.add(a, b) + "\n" + "Values of Strng method : " + s);

		} catch (Throwable e) {
			System.out.println("Error::::"+e);
			e.printStackTrace();
		}
		sc.close();

	}

	int add(int a, int b) {
		int c = a + b;
		return c;
	}

	static String Name(String gaurav, String kaushik) {
		if (gaurav.equals(kaushik)) {
			return "success";
		} else {
			return "fail";
		}

	}

}
