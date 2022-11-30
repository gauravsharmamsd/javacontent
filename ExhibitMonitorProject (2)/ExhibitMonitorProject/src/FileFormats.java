import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="files")
@XmlAccessorType(XmlAccessType.FIELD)
public class FileFormats {
	@XmlElementWrapper(name="listOfFiles")
	@XmlElement(name="file")
	List<FileDescription> fileformats=new ArrayList<FileDescription>();

	public List<FileDescription> getFileformats() {
		return fileformats;
	}

	public void setFileformats(List<FileDescription> fileformats) {
		this.fileformats = fileformats;
	}

	@Override
	public String toString() {
		return "FileFormats [fileformats=" + fileformats + "]";
	}
	
 static Map<String,Date> validFileMap=new HashMap<String,Date>();
	 
	 public static void addValidFiles(String name,Date date) {
		validFileMap.put(name,date);
	}
	 
	 public static Date getDateFromValidFiles(String fileName) {
			return validFileMap.get(fileName);
		}
	 
	 public static Map<String,Date> getValidFiles() {
		return validFileMap;
	}
	 
	 public static Set<String> getKeySet() {
		return validFileMap.keySet();
	}

	
}
