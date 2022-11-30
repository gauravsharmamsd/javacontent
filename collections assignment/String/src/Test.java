
public class Test {
	
	 static {
		 System.out.println("static block-1");
		 }
	 
	static
	{ System.out.println("static block-2"); 
	}
	{ 
		System.out.println("instance block"); 
		}
	Test() 
	{ System.out.println("0-arg cons"); 
	}
	Test(int a) 
	{
		System.out.println("1-arg cons"); }
	public static void main(String[] args)
	{
		Test t=new Test();
	Test t1=new Test(10);
	}
	}

