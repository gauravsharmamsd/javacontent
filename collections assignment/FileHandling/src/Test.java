import java.util.ArrayList;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		ArrayList al=new ArrayList();
al.add(5);
al.add("bbbb");
al.add("abc");
al.add(7);
al.add(77);
al.add("SHiva");
al.add("Krisna");
al.add("Sonu");
al.add("pitamaha");
al.add("vivek");

Mediar w =new Mediar(al);
WriteThread t1 =new WriteThread(w,al);
ReadThread t2 =new ReadThread(w,al);
t1.start();
t2.start();
t1.sleep(2000);
t2.sleep(2000);
}
}