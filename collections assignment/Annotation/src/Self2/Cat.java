package Self2;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;

public class Cat extends Animal {
void A() {
	try {
		check("A");
	} catch (NoSuchMethodException | SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	super.A();
	
}


void B() {
	try {
		check("B");
	} catch (NoSuchMethodException | SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	super.B();
	
}


private void check(String string) throws NoSuchMethodException, SecurityException {
Class c=	this.getClass().getSuperclass();
System.out.println("Class name is    "+c.getName());
Method m=c.getDeclaredMethod(string, null);
Aggressive aggresive=m.getAnnotation(Aggressive.class);
if (aggresive!=null)
	System.out.println("That Annotation is there");
	
}

}
