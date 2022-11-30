package Day3;
public class Car extends Vehicle {
	@Override
	public void accelerate(int delta) {
		this.setSpeed(this.getSpeed()+delta);
		System.out.println(this.getSpeed());
	}

}
