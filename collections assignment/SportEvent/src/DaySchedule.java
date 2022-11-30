

import java.util.Arrays;

public class DaySchedule {
	private String dayName;
	private Sport[] sports;
	public String getDayName() {
		return dayName;
	}
	public void setDayName(String dayName) {
		this.dayName = dayName;
	}
	public Sport[] getSports() {
		return sports;
	}
	public void setSports(Sport[] sports) {
		this.sports = sports;
	}
	public DaySchedule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DaySchedule(String dayName, Sport[] sports) {
		super();
		this.dayName = dayName;
		this.sports = sports;
	}
	@Override
	public String toString() {
		return "DaySchedule [dayName=" + dayName + ", sports=" + Arrays.toString(sports) + "]";
	}
	

}