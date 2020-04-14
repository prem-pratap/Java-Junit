package junit.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo1Testing {

	@Test
	public void testStringConcat() {
		Demo1 obj=new Demo1();
		String result=obj.stringConcat("Virat", "Kohli");
		assertEquals("ViratKohli", result);
		
	}

}
