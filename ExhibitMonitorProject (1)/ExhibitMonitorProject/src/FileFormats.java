import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	FileDescription ff=new FileDescription();
	
	
	public List<FileDescription> getFileformats() {
		return fileformats;
	}

	public void setFileformats(List<FileDescription> fm2) {
	
		this.fileformats = fm2;
		
	}

	

	

	@Override
	public String toString() {
		return "FileFormats [fileformats=" + fileformats + "]";
	}
	
}