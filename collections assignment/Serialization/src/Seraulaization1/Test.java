package Seraulaization1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Maahi implements Serializable{
	String  s1="Mahhi"; 
	String s2="Gaurav"; 
	}
public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	Maahi d=new Maahi();
	Write();
	}

	//Serialization........................
	public static  void Write() {
		Test t=new Test();
	FileOutputStream fos=new FileOutputStream("abc.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(t.d);
	}
	//DeSerialization........................
	public static  void Read() throws IOException, ClassNotFoundException {
		Test t=new Test();
	FileInputStream fis=new FileInputStream("abc.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Maahi d1=(Maahi) ois.readObject();
	System.out.println(d1.s1+"____________ "+d1.s2);
	}

}
