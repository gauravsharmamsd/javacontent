import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCasing {

	@Test
	void test() {
		Calculator c=new Calculator();
		//ADDITION
	int resultInt=	c.Add(5, 4);
	assertEquals(9,resultInt);
float resultFloat=c.Add(1.5f, 2.0f);

assertEquals(3.5,resultFloat );
	Double resultDouble=c.Add(1.75d, 2.25d);
	assertEquals(4,resultDouble);
	
//	SUBSTARCTION
int resultMInt=	c.Sub(5, 4);
		assertEquals(1,resultMInt);
	float resultMFloat=c.Sub(20.5f, 10.5f);
	assertEquals(10.0,resultMFloat);
Double resultMDouble=c.Sub(4d, 2.75d);
assertEquals(1.25,resultMDouble);
	
	
	//MULTIPLICATION
	int resultDInt=	c.Mul(5, 4);
	assertEquals(20,resultDInt);
float resultDFloat=c.Mul(15.5f, 2.0f);
assertEquals(31.0,resultDFloat);
Double resultDDouble=c.Mul(5.50d, 20.00d);
	assertEquals(110,resultDDouble);

//	DIVIDE
	int resultZInt=	c.Div(8, 4);
	assertEquals(2,resultZInt);
float resultZFloat=c.Div(20.8f,10.4f);
assertEquals(2.0,resultZFloat);
Double resultZDouble=c.Div(100.00d, 20.00d);
	assertEquals(5,resultZDouble);
		//fail("Not yet implemented");
	}

}
