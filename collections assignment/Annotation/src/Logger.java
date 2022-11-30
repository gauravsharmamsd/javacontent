
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;


//Logger is Proxy

public class Logger extends A{
	long startTime;
	public void m1() {
       log("m1");
    
     super.m1();
     log1("m1");
     time("m1");
	}
	

		private void time(String methodName) {
			Class c = this.getClass().getSuperclass();
			
			Method m1;
			try {
				m1 = c.getDeclaredMethod(methodName, null);
				
				Annotation annotation = m1.getAnnotation(Time.class);
			
				if(annotation != null) {
long endTime=System.currentTimeMillis();
long executionTime=endTime-startTime;
System.out.println("Time takin is:" +executionTime);
					System.out.println("---------------------------------");
				}
				
			} catch (NoSuchMethodException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	

	}

	private void log1(String methodName) {
		Class c = this.getClass().getSuperclass();
		
		Method m1;
		try {
			m1 = c.getDeclaredMethod(methodName, null);
			
			Annotation annotation = m1.getAnnotation(Exitlog.class);
		
			if(annotation != null) {
				System.out.println("DEBUG : Exiting to "+methodName);
				System.out.println("---------------------------------");
			}
			
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}

	public void m2() {
		log("m2");
		super.m2();
		  log1("m2");
		  time("m2");
	}
	public void m3() {
		log("m3");
		super.m3();
		  log1("m3");
		  time("m3");
	}
	public void m4() {
	log("m4");
	super.m4();
	  log1("m4");
	  time("m4");
}
public void m5() {
	log("m5");
		super.m5();
		  log1("m5");
		  time("m5");
	}
	public void m6() {
		log("m6");
		super.m6();
		  log1("m6");
		  time("m6");
	}
	public void m7() {
		log("m7");
		super.m7();
		  log1("m7");
		  time("m7");
	}
	public void m8() {
		log("m8");
	super.m8();
	  log1("m8");
	  time("m8");
	}

	public void log(String methodName) {
		Class c = this.getClass().getSuperclass();
		//System.out.println(c.getName());
		Method m;
		try {
			m = c.getDeclaredMethod(methodName, null);
			Annotation annotation = m.getAnnotation(EntryLog.class);
			if(annotation != null) {
				 startTime=System.currentTimeMillis();
				System.out.println("DEBUG : Entering "+methodName);
			}
			
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
}
