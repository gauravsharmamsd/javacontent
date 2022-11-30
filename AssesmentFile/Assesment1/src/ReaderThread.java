import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReaderThread extends Thread {
	public ReaderThread() {
		super();
		
	}
	public void run() {
		//Creating a File object for directory
//	      File directoryPath = new File("C:\\Users\\ampri\\eclipse-workspace\\Assesment1");
		 File directoryPath = new File("C:\\Users\\ampri\\OneDrive\\Desktop\\InputFile");
	      //List of all files and directories
	     
	      File filesList[] = directoryPath.listFiles();
	      String filenamefromfolder ;
//	      String regex = "/\\A([a-zA-Z]|[a-zA-Z][\\.txt ])+\\z/";
	      String regx = "^[a-zA-Z\\s][\\\\.txt ]+$";
	     // "^[a-zA-Z]*$"
	      Pattern pattern = Pattern.compile(new String (regx));
	      System.out.println("List of files and directories in the specified directory:");
	      for(File file : filesList) {
	    	  String fileName = file.toString();
	    	  int index = fileName.lastIndexOf('.');
	          if(index > 0) {
	              String extension = fileName.substring(index + 1);
	              System.out.println(fileName + "\t" + extension);
	              filenamefromfolder = file.getName();
	              String filenamewithoutext;
	              //System.out.println("File name: "+file.getName());
	              if(extension.equals("txt") ) {
	            	  System.out.println("File name: "+file.getName());
	            	 
	              }
	              //File Name validation
	              CharSequence inputStr = filenamefromfolder;
	            System.out.println("input"  +inputStr);
	            System.out.println("Pattern"+pattern);
	              Matcher matcher = pattern.matcher(inputStr);
	              System.out.println(matcher.find()+"file name found or not");
	              
		             String filePath =  file.getAbsolutePath();
		             File filePathobj = new File(filePath);
		             Path path = filePathobj.toPath();
	              if(matcher.matches())
	              {
	                  System.out.println("File name is valid---------"+ filenamefromfolder);
	              }
	              else
	              {
	                   //if pattern does not matches
	            	  filePathobj.delete();
	            	  System.out.println("File deleted##########");
	            	  System.out.println("File name not valid!!!!!!!"+ filenamefromfolder);
	              }
	              
	           
	              try {
					BasicFileAttributes file_att = Files.readAttributes(
							  path, BasicFileAttributes.class);
					 // creating simple date format object to make the
	                  // output more readable
//	                  SimpleDateFormat sd
//	                      = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
					 SimpleDateFormat sd
                     = new SimpleDateFormat("HH:mm");
	                 System.out.println("Creation time of "+filenamefromfolder+"is : "+ sd.format(file_att.creationTime().toMillis()));
//	 	        
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	               
	                 
//	 	         System.out.println("File path: "+file.getAbsolutePath());
//	 	         System.out.println("Size :"+file.getTotalSpace());
//	 	         System.out.println(" ");
	          }
	         
	      }
		
		File f = new File("a.txt");
		
		  // Path path = Paths.get("C:\\Users\\ampri\\eclipse-workspace\\Assesment1");
		FileReader fr = null;
		BufferedReader br = null;
//		synchronized () {
			if(f.canRead()) {
				try {
					fr = new FileReader(f);
					br = new BufferedReader(fr);
					String line=null;
					
						while((line=br.readLine())!=null) {
							System.out.println(Thread.currentThread().getName()+" is reading");
							System.out.println(line);
							
							//inf.info.add(line);
							Thread.sleep(100);
//							if(inf.info.size()>=5)
//								inf.notify();
						}
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					try {
						fr.close();
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

	}
//}
