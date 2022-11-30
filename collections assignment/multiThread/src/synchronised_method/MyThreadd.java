package synchronised_method;

public class MyThreadd extends Thread {
	Display d;
	String name;
	MyThreadd (Display d,String name){
		this.d=d;
		this.name=name;
	}
public void run() {
	d.wish(name);
}
}
