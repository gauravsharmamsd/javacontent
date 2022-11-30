package Self;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Z extends X {
	public void fly() {
		log("fly");
		super.fly();
	}
	public void run() {
		log("run");
		super.run();
	}

	public void log(String methodName) {
		Class c = this.getClass().getSuperclass();
		//System.out.println(c.getName());
		Method m;
		try {
			m = c.getDeclaredMethod(methodName, null);
			Annotation annotation = m.getAnnotation(Exitlog.class);
			if(annotation != null) {
				System.out.println("DEBUG : Exiting "+methodName);
			}
			
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

	
	
	

