
public class Product {
	private boolean available;
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public void produce() {
		System.out.println("Producer # Produced !!");
		this.setAvailable(true);
	}
	public void consume() {
		System.out.println("Consumer# Consumed !!");
		this.setAvailable(false);
	}
}
