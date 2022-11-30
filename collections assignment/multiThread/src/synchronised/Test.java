package synchronised;

public class Test {
	synchronized public void wish(String name) {
		int i = 0;
		while (i < 5) {
			System.out.println("Good morning:" + name);

			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();

			}
			i++;
		}

	}
}
