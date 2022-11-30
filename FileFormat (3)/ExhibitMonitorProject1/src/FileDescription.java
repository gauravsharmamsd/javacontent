import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class FileDescription {

	@Override
	public String toString() {
		return "FileDescription [filename=" + filename + ", timeToArrive=" + timeToArrive + ", outfileName="
				+ outfileName + ", fld=" + fld + "]";
	}

	public List<Field> getFld() {
		return fld;
	}

	public void setFld(List<Field> fld) {
		this.fld = fld;
	}

	private String filename;
	private String timeToArrive;
	private String outfileName;
	@XmlElementWrapper(name = "format")
	@XmlElement(name = "field")
	private List<Field> fld = new ArrayList<Field>();

//	public String getFileName() {
//		return filename;
//	}
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getTimeToArrive() {
		return timeToArrive;
	}

	public void setTimeToArrive(String timeToArrive) {
		this.timeToArrive = timeToArrive;
	}

	public String getOutfileName() {
		return outfileName;
	}

	public void setOutfileName(String outfileName) {
		this.outfileName = outfileName;
	}

}
