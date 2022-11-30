
public class Car {
	private int speed;
	public void setSpeed(int newSpeed){
		if(newSpeed > 130) {
			throw new RuntimeException("You Fool go learn driving first");
		}
		this.speed = newSpeed;
	}

}
