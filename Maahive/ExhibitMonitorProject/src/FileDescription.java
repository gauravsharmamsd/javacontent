import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
public class FileDescription {
 Map<String,Field> map=new HashMap<>();
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
    //public static 
	
	
	//name.put("filename",getFld();
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
	public Map<String,Field>  populateMap() {
		for(Field f:fld) {
		    map.put(f.getName() ,f);
			
		}
		
		return map;
		
	}
	
	
	}
