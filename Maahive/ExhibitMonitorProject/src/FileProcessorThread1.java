import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class FileProcessorThread1 extends Thread {
	String outFileName;
	Map<String, Field> map;
    FileDescription fd;;
    Field key;
    String fildName;
   int  fileFieldLength ;
	public FileProcessorThread1(String outFileName, Map<String, Field> map) {
		this.outFileName = outFileName;
		this.map = map;
		 System.out.println("_______________map____________"+map);
		//System.out.println(map+"    "+outFileName);
		this.start();
		System.out.println("Hppy Republuc day");
	
		
		}
	
	
	
	
	public void run() {
			String line = null;
			FileReader fr = null;
			try {
				fr = new FileReader(
						"C:\\Users\\Kapil Kaushik\\Downloads\\ExhibitMonitorProject (1)\\ExhibitMonitorProject\\Out\\"
								+ outFileName);}
			 catch (FileNotFoundException e) {}
			 BufferedReader br = new BufferedReader(fr);
             try {String fields[] = null;                             
			 while ((line = br.readLine()) != null) {
			 fields = line.split(",");
			// System.out.println(fields.length);
			 if(fields.length!=map.keySet().size()) 
		   	 {     
			 saveTheInvalid(fields);
			 boolean res=DatabaseClass.saveInInvalidDB(fields);
			 if(res=true) {
			 System.out.println("'Data goes in databse ");}
			 continue;}
			    
				for(int i=0;i<fields.length;i++) {
				for ( String fildName : map.keySet() ) {
				System.out.println( fildName );
				int fileFieldLength     =	fields[i].length();
				int max= map.get(fildName).getMaxlength();
		     	int min=map.get(fildName).getMinlength();
		     	boolean opt=map.get(fildName).getOptional();
				System.out.println("_____________________"+fileFieldLength+"    "+fields[i]);
				System.out.println("_____________________"+fildName);
			    if(min <= fileFieldLength && fileFieldLength< max) {
			    System.out.println("Data format is correct");
			 	 }
			    else {
			    System.out.println("Data format is Incorrect");
			    boolean res=DatabaseClass.saveInInvalidDB(fields);
			    if(res==true) {
				System.out.println("Data stored Succesfully in DB");	
				}
				else {
				System.out.println("Data not entered in DB");	
				}
			    
			    }

				break;}}
				 boolean res=DatabaseClass.saveRecord(fields);
				    if(res==true) {
					System.out.println("Data stored Succesfully in DB");	
					}
					else {
					System.out.println("Data not entered in DB");	
					}
				
				}}
			    catch (IOException e) {}catch (SQLException e) {}}

			     private void saveTheInvalid(String[] fields) throws IOException {
				 PrintWriter pr = new PrintWriter("C:\\Users\\Kapil Kaushik\\Downloads\\ExhibitMonitorProject (1)\\ExhibitMonitorProject\\err\\err.txt");
	             for (int i=0; i<fields.length ; i++){
	             pr.println(Arrays.toString(fields));}
	             pr.close();}
}
	        
	    
	 
		
		
	
	
	
				

