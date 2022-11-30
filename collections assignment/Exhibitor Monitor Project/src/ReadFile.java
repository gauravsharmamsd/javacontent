import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {

public static void readFile(String filename) throws Exception{
	 FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

     String line;
	while((line = bufferedReader.readLine()) != null)
     {
         System.out.println(line);
     }

      bufferedReader.close();
 }

}
