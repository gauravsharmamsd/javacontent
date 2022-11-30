import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
public class FileDescription {

	public String getFilename() {
		return filename;
	}
	@Override
	public String toString() {
		return "FileDescription [filename=" + filename + ", timeToArrive=" + timeToArrive + ", outfileName="
				+ outfileName + ", fld=" + fld + "]";
	}
	public void setFilename(String filename) {
		this.filename = filename;
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
	@XmlElementWrapper(name="format")
	@XmlElement(name="field")
	private List<Field>fld = new ArrayList<Field>();
	
	public Date getTimeToArrive() {
		String[] timeSplit = timeToArrive.split(":");
		int minute = Integer.parseInt(timeSplit[1]);
		int hour = Integer.parseInt(timeSplit[0]);
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, 0);
		Date date = calendar.getTime();
		return date;
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
