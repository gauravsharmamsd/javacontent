import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
	public static void writeFile(List<Customer> al, File file) throws IOException{
		//File file1=new File("file");
		String fileName="C:\\collections assignment\\Exhibitor Monitor Project\\"+file;
	FileWriter writer = new FileWriter(fileName); 
	for(Customer str: al) {
	  writer.write(str + System.lineSeparator());
	}
	writer.close();
}
}
