import java.util.ArrayList;
import java.util.List;

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
	static ArrayList<String> al=new ArrayList<String>();
	public static void setValidFile(String fileName) {
		al.add(fileName);
		
	}
	public static ArrayList<String> getValidFiles(){
		
		return al;
	} 
	
}
