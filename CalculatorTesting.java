package junit.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTesting {

	@Test
	public void testAdd() {
		Calculator cal=new Calculator();
		int res=cal.add(2, 10);
		assertEquals(12,res);
	}

}
