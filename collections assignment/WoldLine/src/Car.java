
public class Car {
	private int speed;
	public void setSpeed(int newspeed) {
		if(newspeed>130) {
			throw new RuntimeException("go to heell");
		}
		this.speed=newspeed;
	}

}
