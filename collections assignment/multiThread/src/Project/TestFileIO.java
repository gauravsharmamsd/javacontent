package Project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
class Data{
	List<String> list=new ArrayList<String>();

}
public class TestFileIO {

	public static void main(String[] args) {
		System.out.println("File Reading is going to happen");
		Data d = new Data();
		Thread t1 = new FileReadThread(d);
		Thread t2 = new FileWriteThread(d);

		t1.setName("ReadThread");
		t2.setName("Write Thread");
		t1.start();
		t2.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(d.list);

	}
}
