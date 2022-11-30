import java.io.File;

public class Demo1 {
	public static void main(String[] args) {
		File[] files = new File("./bin/input").listFiles();
		
		
		for(File f: files) {
			System.out.println(f.getName());
		}
	}

}
