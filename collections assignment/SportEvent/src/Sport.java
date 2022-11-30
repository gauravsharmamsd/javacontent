
import java.util.Arrays;

public class Sport {
	private String name;
	private int noofplayers;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoofplayers() {
		return noofplayers;
	}
	public void setNoofplayers(int noofplayers) {
		this.noofplayers = noofplayers;
	}
	public Sport(String name, int no) {
		super();
		this.name = name;
		this.noofplayers = no;
	}
	public Sport() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Sport [name=" + name + ", noofplayers=" + Arrays.toString(noofplayers) + "]";
	}
	

}
	