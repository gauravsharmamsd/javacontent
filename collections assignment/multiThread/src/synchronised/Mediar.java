package synchronised;

public class Mediar extends Thread{
	Test t;
	String name;
	Mediar(Test t2,String name){
		this.t=t2;
		this.name=name;
		
	}
public void run() {
	t.wish(name);
}
}
