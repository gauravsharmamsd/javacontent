package avc.aa;

public class Obj {
	int id=7;
	String name="gurav";
	Obj(int id,String name){
		this.id=id;
		this.name="gurav";
	}
	Obj(Obj o){
		
		id=o.id;
name=o.name;
	}
	
	void display() {
		System.out.println(id);
		System.out.println(name);
	}
public static void main(String args[]) {
	Obj o1=new Obj(6,"abc");
	Obj o2=new Obj(o1);
	o1.display();
	o2.display();
}
}
