import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Mediar {
    static ArrayList al=new ArrayList();
	public Mediar(ArrayList al) {
		this.al=al;
	}
	public static ArrayList getAl() {
		return null;
	}
	public void setAl(ArrayList al) {
		this.al = null;
	}
	
	public void Write() {
	PrintWriter writer = null;
	try {
		writer = new PrintWriter("Mno.text");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	    for (Object line : Mediar.getAl()) {
	        writer.println(line);
	    }
	    writer.close();
	    
}
	public void read() {
	 BufferedReader bufReader = null;
	try {
		bufReader = new BufferedReader(new FileReader("Mno.text"));
	} catch (FileNotFoundException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	} 
	
	 String line = null;
	try {
		line = bufReader.readLine();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	 while (line != null) { 
		
	al.add(line); try {
		line = bufReader.readLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} }
	 try {
		bufReader.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} System.out.println("Content of ArrayLiList:");
	 System.out.println(al);



	}


}
