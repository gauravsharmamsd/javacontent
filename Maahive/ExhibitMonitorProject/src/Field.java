import javax.xml.bind.annotation.XmlRootElement;

public class Field {
	private String name;
	private int maxlength;
	private int minlength;
	private boolean optional;
	public boolean getOptional() {
		return optional;
	}
	public void setOptional(boolean optional) {
		this.optional = optional;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxlength() {
		return maxlength;
	}
	public void setMaxlength(int maxlength) {
		this.maxlength = maxlength;
	}
	public int getMinlength() {
		return minlength;
	}
	public void setMinlength(int minlength) {
		this.minlength = minlength;
	}
	@Override
	public String toString() {
		return "Field [name=" + name + ", maxlength=" + maxlength + ", minlength=" + minlength + ", optional="
				+ optional + "]";
	}
	
	
	
}
