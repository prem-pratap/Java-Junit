package junit.first;

import static org.junit.Assert.*;
import org.junit.Test;

public class stringPallindromeTesting {
	

	@Test
	public void test() {
		stringPallindrome obj=new stringPallindrome();
		assertEquals("Result:", true, obj.pallindromeCheck("malayalam"));
		assertEquals("Result:", false, obj.pallindromeCheck("kerala"));
        assertTrue("Result: ", obj.pallindromeCheck("nayan"));
        assertTrue("Result: ", obj.pallindromeCheck("madam"));
        assertFalse("Result: ", obj.pallindromeCheck("kerala"));
        assertFalse("Result: ", obj.pallindromeCheck("india"));
	}

}
