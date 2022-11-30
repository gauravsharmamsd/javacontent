import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class FileValidatorThread extends Thread{
	FileDescription fDesc;
	File xmlFile = new File("customer.xml");
	FileFormats fileFormats = null;
	File file;

	FileValidatorThread(File f) {
		this.file = f;
	}

	public void run() {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(FileFormats.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			fileFormats = (FileFormats) jaxbUnmarshaller.unmarshal(xmlFile);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 3 Validations
		// 1.ValidateName
		if (isNameValid(file) && !isLate(file) && !isDuplicate(file)) {
			this.file.renameTo(new File("./inprocess/" + this.file.getName()));
			FileProcessorThread processor = new FileProcessorThread(this.file.getName());
			FileFormats.setValidFile(this.file.getName());
		} else {
			// Delete File
			file.delete();
		}
		// 2.Validate InTime

		// 3.Validate if it is duplicate

	}

	private boolean isDuplicate(File file) {
		for (String fileName : FileFormats.getValidFiles()) {
			if(fileName.equals(file.getName())) {
				return false;
			}
		}
		return false;
	}

	private boolean isLate(File file) {
		FileDescription fileDescription=null;
		for (FileDescription fDesc : fileFormats.getFileformats()) {
			if(fDesc.getFilename().equals(file.getName())) {
				fileDescription=fDesc;
			}
		}
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm");
		String currentTime = dateFormat.format(date);
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("hh:mm");
		
		System.out.println("Current Time :: " + currentTime);
		
		String timeOfArrival = fileDescription.getTimeToArrive();
		System.out.println("timeOfArrival :: " + timeOfArrival);
		
		Date time1;
		Date time2;

		try {
			time1=dateFormat1.parse(currentTime);
			time2 = dateFormat1.parse(timeOfArrival);
			int comp=time1.compareTo(time2);
		

			
			System.out.println(time1+" time1 "+time2+" time2");
			System.out.println("compare "+comp);
			if (comp < 0) {
				System.out.println("On-Time");
				return false;
			}else {
				System.out.println("Time-Out");
				return true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return false;
	}

	private boolean isNameValid(File file) {
		for (FileDescription description : fileFormats.getFileformats()) {
			if (description.getFilename().equals(file.getName())) {
				return true;
			}
		}
		

		return false;
	}

}
