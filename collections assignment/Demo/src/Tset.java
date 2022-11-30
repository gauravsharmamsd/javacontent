import java.io.File;

public class Tset {

	public static void main(String[] args) {
		File file = new File("C:\\collections assignment\\Demo\\Abc\\A.txt");
		if(file.renameTo
				   (new File("C:\\collections assignment\\Demo\\Out\\A.txt"))) {
			 file.delete();
	    System.out.println("File moved successfully");
	}
	else
	{
	    System.out.println("Failed to move the file");
	}
				
		
	}

}

