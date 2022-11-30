interface Xyz{
	public void draw();
	
}
public class Abc {

	public static void main(String[] args) {
		int a=4;
		
		Xyz v=()->
			 {
				System.out.println(a);
				};
			
		v.draw();
		}
	}
//		
//Xyz x=()->{
//	System.out.println(a);
//};
//
//x.draw();
//}
//}


/*interface Drawable{  
    public void draw();  
}  
public class LambdaExpressionExample {  
    public static void main(String[] args) {  
        int width=10;  
  
        //without lambda, Drawable implementation using anonymous class  
        Drawable d=new Drawable(){  
            public void draw(){System.out.println("Drawing "+width);}  
        };  
        d.draw();  
    }  
}  */