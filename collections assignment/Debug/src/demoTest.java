import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class demoTest {
Demo d= new Demo();

	@Test
	void test() {
		int res;
	res=	d.divide(20, 10);
	assertEquals(2,res);
		//fail("Not yet implemented");
	}

}
