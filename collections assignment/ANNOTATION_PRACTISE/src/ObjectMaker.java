
public class ObjectMaker  {

	public static A maker(String className) {
		try{
//		Class c=Class.forName(className);
//		A tt=(A) c.newInstance();
		A tt = (A)Class.forName(className).newInstance();
		//System.out.println("............"+tt.getClass().getName());
		Mediar m=new Mediar(tt);
		//m.xy();
	//	tt.xy();
		return m;

}catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	return null;
	}
		
		
	}
//Class c =Class.forName(className);
/*Bank o=(Bank) c.newInstance();
//Bank bank = (Bank)Class.forName(className).newInstance();
System.out.println("object name is:   "   +o.getClass().getSimpleName());
BankLogger logger = new BankLogger(o);
System.out.println(logger.getClass().getSimpleName());
return logger;
} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
return null;
}*/