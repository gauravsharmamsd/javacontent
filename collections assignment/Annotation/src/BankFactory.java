
public class BankFactory {

	public static Bank getObject(String className) {
		try {
			Class c = Class.forName(className);
			Bank o = (Bank) c.newInstance();

			System.out.println("object name is:   " + o.getClass().getSimpleName());
			BankLogger logger = new BankLogger(o);
			System.out.println(logger.getClass().getSimpleName());
			return logger;
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
