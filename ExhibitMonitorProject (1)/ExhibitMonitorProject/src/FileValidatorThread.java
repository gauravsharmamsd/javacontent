import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class FileValidatorThread extends Thread {
	static Map<String,LocalDate>mapToStore=new HashMap<>();
	
		
				
//	static Set<String> mp;
	static FileDescription fd=null;
	 Map <String,Field> map;
	static Vector<String>vector=new Vector<String>();
	static int incomingTime;
	 static Date incomingTimeInFormat;
	 int XmlTime;
	 LocalDate date;
    
	//Constructor
	 File file;
	 static FileFormats fm2=null;
	 
	FileValidatorThread(File f, FileFormats fm2){
		this.file = f;
		
		System.out.println(file);
		
		this.fm2=fm2;
		System.out.println("___________"+fm2);
		
	}
//	for(FileDescription f:fm.getFileformats()) {
//		f.populateMap();
//	}
//	
	
	public void run() {
		
	if(isNameValid(file )    && izFileNotDuplicate(file)  && isNotLate(file)) {
			
		
		System.out.println("All cond get passed"+file.getName()+"  "+incomingTime);
		mapToStore.put(file.getName(), date);
		System.out.println(mapToStore);
		System.out.println(mapToStore.size());
	
		System.out.println("_____________________________________________________________________________________");
	   
	
		String outFileName=file.getName();
		System.out.println("_______________current file_"+this.file.getName());
		System.out.println("__________"+file);
	    if(file.renameTo(new File("C:\\Users\\Kapil Kaushik\\Downloads\\ExhibitMonitorProject (1)\\ExhibitMonitorProject\\Out\\"+outFileName))) {
		System.out.println("moved succesfully");
		FileProcessorThread1 ft1 = null;
		for(FileDescription fd :fm2.getFileformats()) {
		//fm2.setFileformats1(fd);
		//FileDescription oneObjAtTime=fm2.getFileformats1();
		//System.out.println(oneObjAtTime+"    "+fd.getOutfileName());
	    map=fd.populateMap();
	  
		// String
		}
		//System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+fd.populateMap());	
		//ft1 =new  FileProcessorThread1(outFileName,map);
		}
		else {System.out.println("not  move"); }}
		else { System.out.println(" delete that"+this.file.getName());}
	
	}
	
		///this. file.delete();}}
	
	private boolean isNotLate(File file2) {
		 	
	Calendar now = Calendar.getInstance();
	for(FileDescription fd: fm2.getFileformats()) {
	String time1 =(fd.getTimeToArrive());
	
	XmlTime=toMins(time1);}
	System.out.println("Time in minutes    "+XmlTime  +" minuts");
	incomingTimeInFormat= now.getTime();
	 date=LocalDate.now();
	 System.out.println(date);  
	incomingTime=(now.get(Calendar.HOUR_OF_DAY)*60+ + now.get(Calendar.MINUTE));
	
    System.out.println("Current time of incoming file  "+incomingTime+" minuts");
	if(incomingTime<XmlTime  )      {
		return true;
	}
	return false;}
		  
	private static int toMins(String s) {
		 String[] hourMin = s.split(":");
	    int hour = Integer.parseInt(hourMin[0]);
	    int mins = Integer.parseInt(hourMin[1]);
	    int hoursInMins = hour * 60;
	    return hoursInMins + mins;

	}
	//method to check duplicate
			
	private boolean izFileNotDuplicate(File file2) {
	       //   System.out.println("............................."+mp);
				if((incomingTime<XmlTime|| incomingTime>1440) && isNameValid(file2) ) {
				return vector.add(file2.getName());}
				return true;
	
	}
//method to check name valid
			private boolean isNameValid(File file2) {
				
				System.out.println("__________name of incoming _"+file2.getName());
				//c.txt----
				
				
				
				//fm2.setFileformats(fm2);
				
		List<FileDescription>	 al= fm2.getFileformats();
			System.out.println("All the data FROM XML TO LIST"+al);
			
			
				
				for(FileDescription fdf:fm2.getFileformats()) {
					
					System.out.println("...................."+fdf);
					
				System.out.println("_________name of xml_"+	fdf.getFilename());
				
			
				if(fdf.getFilename().equals(file2.getName())) {
										return true;
									}
				}
										return false;
		
			}
			
			
			
			
			
}
