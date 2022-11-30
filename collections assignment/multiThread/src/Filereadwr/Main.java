package Filereadwr;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList<String>();
		al.add("suni");
		al.add("rohit");
		//System.out.println(al);
		FileRead m=new FileRead(al);
		
    WriteThread p = new WriteThread(m);
//	ReadThread c = new ReadThread();
		p.start();
		//.start();
		public static void writeFile1() throws IOException {
			File file=new File("mnp.text");
			FileOutputStream fos = new FileOutputStream(file);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		 
			for (Object data:al) {
				bw.write(data+ System.lineSeparator());
				bw.newLine();
			}
		 
			bw.close();
//			}
//
//		public static void readFile1(File fileName) throws IOException {
//
//			
//		
//			FileReader fr = new FileReader(fileName);
//			BufferedReader br = new BufferedReader(fr);
//			String line;
//			while((line = br.readLine()) != null){
//			   al.add(line);
//			   // System.out.println(line);
//			}
//		}
	}





	}

	public Object file;

}
