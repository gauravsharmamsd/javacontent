import java.io.File;
import java.util.Calendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ParseUnmarsheelling {
	File file=new File("customer.xml");
	public FileFormats pu() throws JAXBException {
		JAXBContext jaxbContext=JAXBContext.newInstance(FileFormats.class);
		Unmarshaller jaxbUnmarshaller=jaxbContext.createUnmarshaller();
		return (FileFormats) jaxbUnmarshaller.unmarshal(file);

	
	
}
}

/*      System.out.println("____________info about file_____"+filesStore.put(file, time2++));
	
	this.file.renameTo(new File("C:\\Users\\Kapil Kaushik\\Desktop"+this.file.getName()));
	System.out.println("File moved Succesfully");
//	for(FileDescription fd:fm.getFileformats()) {
//	FileProcessorThread processor = new FileProcessorThread(this.file.getName(),fd.getOutfileName());	
//	}
}else {
	//Delete File
	System.out.println("File Deleted");
	file.delete();
}
//2.Validate InTime

}*/	private boolean isLate(File file2) {
    Calendar now = Calendar.getInstance();
    for(FileDescription fd:fm.getFileformats()) {
    	boolean ch=isNameValid(file2);
    	if(ch==true) {
   String time1 =(fd.getTimeToArrive());
    	//System.out.println(time1);
    int time3=	toMins(time1);
   System.out.println("Time of icoming xml __  "+time3);
    time2=(now.get(Calendar.HOUR_OF_DAY)*60
           + 
           + now.get(Calendar.MINUTE));

    System.out.println("Time of the current file__"+time2);
    if(time3>time2) {
    System.out.println("FIle is on time....Good to go");
	return false;
  }

}}
    System.out.println("Coming late");
	return true;}


private boolean isNotDuplicate(File file2) {
	boolean status=arrivedFiles.add(file2.getName());
	if(status==true) 
		System.out.println("Duplicate File not Found ");
	return status;

	
}
private static int toMins(String s) {
	
    String[] hourMin = s.split(":");
    int hour = Integer.parseInt(hourMin[0]);
    int mins = Integer.parseInt(hourMin[1]);
    int hoursInMins = hour * 60;
    return hoursInMins + mins;

}
	


}
