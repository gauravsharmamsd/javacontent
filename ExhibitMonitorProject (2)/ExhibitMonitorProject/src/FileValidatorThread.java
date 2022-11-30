import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class FileValidatorThread extends Thread {
	File xmlFile=new File("customer.xml");
	FileFormats fm=null;
	File file;
	int noOfFiles;
	static Set<String> arrivedFiles = new HashSet<String>(); 
	FileValidatorThread(File f, int nof){
		this.file = f;
		this.noOfFiles=nof;
	}


	public void run() {
		try {
			JAXBContext jaxbContext=JAXBContext.newInstance(FileFormats.class);
			Unmarshaller jaxbUnmarshaller=jaxbContext.createUnmarshaller();
			fm = (FileFormats)jaxbUnmarshaller.unmarshal(xmlFile);

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//3 Validations
		//1.ValidateName
		if(isNameValid() && !isLate() && isDuplicate()) {
			int index=search(this.file.getName());
			Calendar cal = Calendar.getInstance();
			fm.addValidFiles(file.getName(),cal.getTime());
			this.file.renameTo(new File("./bin/inprocess/"+this.file.getName()));
			FileProcessorThread processor = new FileProcessorThread(this.file.getName(),fm.fileformats.get(index).getOutfileName());	
		}else {
			//Delete File
			System.out.println("File Deleted");
			file.delete();
		}
		//2.Validate InTime
		;
		//3.Validate if it is duplicate
		;
	}
	private boolean isNotDuplicate() {
		boolean status=arrivedFiles.add(file.getName());
		if(status==false)
			System.out.println("Duplicate File Found and Deleted");
		return status;
	}
	private boolean isLate() {
		for (FileDescription fdescription : fm.getFileformats()) {
			if(file.getName().equals(fdescription.getFilename())&& file.lastModified() < fdescription.getTimeToArrive().getTime()) {
				System.out.println("In Time");
				return false;
			}
			else {
				System.out.println("Time Out File Deleted");
			}
		}

		return true;
	}

	private boolean isNameValid() {

		for (FileDescription fdescription : fm.getFileformats()) {
			if(fdescription.getFilename().equals(file.getName())) {
				System.out.println("File Name is Valid: "+file.getName());
				return true;
			}

		}
		return false;
	}

	private int search(String name) {
		for(int i=0; i<fm.fileformats.size(); i++) {
			if(file.getName().equals(fm.fileformats.get(i).getFilename()))
				return i;
		}
		return -1;
	}

	private boolean isDuplicate() { 
		Date date=fm.getDateFromValidFiles(file.getName());
		if(date == null) {
			return false;
		}
		Calendar currentFileCalendar = Calendar.getInstance();
		currentFileCalendar.setTime(date);
		Calendar today = Calendar.getInstance();

		Iterator<String>it= fm.getKeySet().iterator();
		while (it.hasNext()) {
			if (it.next().equals(file.getName())) {
				if (today.get(Calendar.YEAR) == currentFileCalendar.get(Calendar.YEAR) && today.get(Calendar.DAY_OF_YEAR) == currentFileCalendar.get(Calendar.DAY_OF_YEAR)) {
					System.out.println("Duplicate delete");
					return true;
				} else {
					return false;
				}
			}

		}

		return false;

	}
}
