package Day3;

public abstract class Vehicle {
	private int speed;
	private String make;
	private String model;
	private String year;
	private String transmissionType;

	
	
	abstract public void accelerate(int change);
	 public int getSpeed() {
		return speed;
	}
	 public void setSpeed(int speed) {
		 this.speed=speed;
	 }
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getTransmissionType() {
		return transmissionType;
	}
	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}
		
	}
	