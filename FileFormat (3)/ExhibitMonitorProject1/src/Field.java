

public class Field {
	private String name;
	private String maxlength;
	private String minlength;
	private String optional;
	public String getOptional() {
		return optional;
	}
	public void setOptional(String optional) {
		this.optional = optional;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaxlength() {
		return maxlength;
	}
	public void setMaxlength(String maxlength) {
		this.maxlength = maxlength;
	}
	public String getMinlength() {
		return minlength;
	}
	public void setMinlength(String minlength) {
		this.minlength = minlength;
	}
	@Override
	public String toString() {
		return "Field [name=" + name + ", maxlength=" + maxlength + ", minlength=" + minlength + ", optional="
				+ optional + "]";
	}
	
	
	
}
