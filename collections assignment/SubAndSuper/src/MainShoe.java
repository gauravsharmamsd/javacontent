
public class MainShoe {
public static void main(String args[]){
	Shoe s= new Shoe("nike",6);
	System.out.println(s.brand+" "+s.Size);
	Walking w=new Walking(true,"Nike",10);
	System.out.println(w.gorTex+" "+s.brand+" "+w.Size);
	Running r= new Running(50,"Addidas",7);
	System.out.println(r.Weight+" "+s.brand+" "+w.Size);
//	Walking w= new Walking()
	
}
}
