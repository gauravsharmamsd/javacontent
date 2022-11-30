package Day3;

public class Bike extends Vehicle {
	public void accelerate(int delta) {
		this.setSpeed(this.getSpeed()+delta);
		System.out.println(this.getSpeed());
	}

}
