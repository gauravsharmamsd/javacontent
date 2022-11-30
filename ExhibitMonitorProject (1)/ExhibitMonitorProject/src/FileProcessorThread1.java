import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class FileProcessorThread1 extends Thread {
	String outFileName;
	Map<String, Field> map;
    FileDescription fd;;
    Field key;
    String fildName;
   int  fileFieldLength ,max,min;
   List<String> FieldName=new ArrayList<String>();
	public FileProcessorThread1(String outFileName, Map<String, Field> map) {
		this.outFileName = outFileName;
		this.map = map;
		
		//System.out.println(map+"    "+outFileName);
		this.start();
	//	System.out.println("Hppy Republuc day");
		for ( String fildName : map.keySet() ) {
		   // System.out.println( fildName );
		     FieldName.add(fildName);
		}
		 System.out.println( FieldName );
		
		}
	
	
	
	
	public void run() {
		 
		processTheFiles();
		
		
	}
	public void processTheFiles() {
		  java.util.Date date = new java.util.Date();    
		   // System.out.println(date);   
		       
		try {
			DatabaseClass.ArrivedFiles(outFileName, date);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			String line = null;
			FileReader fr = null;
			try {
				fr = new FileReader(
						"C:\\Users\\Kapil Kaushik\\Downloads\\ExhibitMonitorProject (1)\\ExhibitMonitorProject\\Out\\"
								+ outFileName);}
			 catch (FileNotFoundException e) {}
			 BufferedReader br = new BufferedReader(fr);
             try {
            	 int lineNo = 0;
            	 String fields[] = null; 
            		
			     while ((line = br.readLine()) != null) {
			     fields = line.split(",");
			// System.out.println(fields.length);
			     lineNo++;
			     System.out.println(fields.length+"    "+map.size());
			 if(fields.length!=map.size()) 
		   	 {     
			     saveTheInvalid(outFileName,lineNo,line);
			 boolean res=DatabaseClass.invalidFieldRecord(outFileName,lineNo,line);
			 if(res=true) {
			      System.out.println("'Data goesssssss in databse ");}
			 continue;}
			
			
				for(int i=0;i<fields.length;i++) {
				//	System.out.println(map);
			
			         int fileFieldLength     =	fields[i].length();
				      max= map.get(FieldName.get(i)).getMaxlength();
		              min=map.get(FieldName.get(i)).getMinlength();
		     	    // boolean opt=map.get(fildName).getOptional();
				     System.out.println("FieldName   "+FieldName.get(i)+"  FieldLength   "+fileFieldLength+" ElementInThatField  "+fields[i]);
				    // System.out.println("_____________________"+fildName);
			    if(min <= fileFieldLength && fileFieldLength< max) {
			         System.out.println("Data format is vry correct");
			 	 }
			    else {
			         System.out.println("Data format is Incorrect");
			    boolean res=DatabaseClass.invalidFieldRecord(outFileName,lineNo,line);
			    if(res==true) {
				      System.out.println("Data stored Succesfully in DB");	
				}
				else {
				      System.out.println("Data not entered in DB");	
				}
			    
			    }

				
				}
				 boolean res=DatabaseClass.saveRecord(fields,outFileName);
				    if(res==true) {
					System.out.println("Data stored Succesfully in DB");	
					}
					else {
					System.out.println("Data not entered in DB");	
					}
				
				}}
			    catch (IOException e) {}
                catch (SQLException e) {} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
             }

        private void saveTheInvalid(String outFileName2, int lineNo, String line) throws FileNotFoundException {
        //	System.out.println("Heer");
        	//System.out.println("FileName"+outFileName2+"  LineNo  "+lineNo+"Content in line"+line);
       	// PrintWriter pr = new PrintWriter("C:\\Users\\Kapil Kaushik\\Downloads\\ExhibitMonitorProject (1)\\ExhibitMonitorProject\\err\\err.txt");
        	  PrintWriter out = new PrintWriter("C:\\Users\\Kapil Kaushik\\Downloads\\ExhibitMonitorProject (1)\\ExhibitMonitorProject\\err\\err.txt"); 

              // Write the name of four oceans to the file
              String c="pppp";
              out.println(lineNo);   // Step 3
              out.println(outFileName2);
              out.println(line);
            //  out.print(0);
              out.println("Arctic");

              // Close the file.
              out.close();  // Step 4
          
      
     }
 }



	        
	    
	 
		
		
	
	
	
				

