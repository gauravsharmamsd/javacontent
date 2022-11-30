import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.DateFormat.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FileProcessorThread extends Thread {

	String[] fields;
	int l;
	String words1;
	String fileName;
	
	List list = new ArrayList();
	Set<List> set = new HashSet<List>();
	List<FileDescription> al;
	// List<List> ll=new ArrayList<List>();

	public FileProcessorThread(String fileName, List<FileDescription> listp) {
		this.fileName = fileName;
		this.outFileName = outFileName;
		this.al = listp;
		System.out.println("__________" + fileName);
		System.out.println("+++++++++++++" + outFileName);

	}

	public void run() {

		try {
			String line = null;
			FileReader fr = new FileReader(
					"C:\\Users\\Kapil Kaushik\\Downloads\\ExhibitMonitorProject (1)\\ExhibitMonitorProject\\Out\\"
							+ fileName);
			BufferedReader br = new BufferedReader(fr);

			while ((line = br.readLine()) != null) {
				String fields[] = line.split(", ");
				for (String w : fields) {
					list.add(w);
				}
				// System.out.println(list);
				if (fields.length != 3) {
					FileWriter writer = new FileWriter(
							"C:\\Users\\Kapil Kaushik\\Downloads\\ExhibitMonitorProject (1)\\ExhibitMonitorProject\\err\\err.txt");
					for (Object str : list) {
						writer.write(str + System.lineSeparator());
					}
					list.clear();
					writer.close();
				} else {
				}	

				
			}
			System.out.println("________the data in list________" + list);
			System.out.println("The very first element is"+list.get(0).toString().length());
			System.out.println();
		
		
			   for  (int j = 0; j < al.size(); j++) {
				   for  (int i = 0; i < al.get(j).getFld().size(); i++) {
					    if (list.get(i).toString().length() >= al.get(j).getFld().get(i).getMinlength() &&
					    		list.get(i).toString().length() < al.get(j).getFld().get(i).getMaxlength()) {
					    	//DatabaseClass.insertValidData(list);
					    }
					  	else {
					    	System.out.println("sorry");
					    }
					  
//					    if(Integer.parseInt(fields[1])==
//					  (al.get(0).getFld().get(0).getMaxlength())) {
//					  System.out.println("True________________________"); }
//					  
//					  else { System.out.println("Wrong________________"); }
//					    
					   }  
			   }
			  
			   System.out.println("All goes well.....");
			   
			  }
	// System.out.println("Valid " + al); }

	catch(

	FileNotFoundException e)
	{
	}catch(
	IOException e)
	{}
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}

}
}
//for (int i = 0; i < fields.length; i++) {
//
//		for (FileDescription fdf : al) {
//			int max = fdf.getFld().get(i).getMaxlength();
//
//			int min = fdf.getFld().get(i).getMinlength();
//			System.out.println(max);
//			System.out.println(min);
//		}
//
//	}
//	System.out.println(list.get(0));
//
//	System.out.println("All is well");// }
//
//}
//}
