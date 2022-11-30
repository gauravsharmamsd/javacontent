
public class TestProdCons {

	public static void main(String[] args) {
		Product product = new Product();
		ProducerThread p = new ProducerThread(product);
		ConsumerThread c = new ConsumerThread(product);
		p.start();
		c.start();

	}

}
