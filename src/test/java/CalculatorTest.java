import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	@Test
	void assertEqual() {
		Calculators cal=new Calculators();
		int expected = 4;
		assertEquals(expected, cal.add(2, 2),"add two numbers are equal");
	}
	@Test
	void assertNotEqual()
	{
		Calculators cal=new Calculators();
		int expected=3;
		assertNotEquals(expected,cal.add(2, 2),"add two numbers not are equal");
	}
	@Test
	void assertTrue()
	{
		Calculators cal=new Calculators();
		Assertions.assertTrue(cal.add(2, 3) > 0,"add two numbers should return a positive number");
	}
	@Test
	void assertFalse()
	{
		Calculators cal=new Calculators();
		Assertions.assertFalse(cal.add(2, 3) < 0,"add two numbers should return a negative number");
	}
	@Test
	void assertNull()
	{
		
		String result=null;
		Assertions.assertNull(result);
	}
	@Test
	void assertNotNull()
	{
		String result="anu";
		Assertions.assertNotNull(result);
	}
	@Test
	void assertException()
	{
		Calculators cal=new Calculators();
		Assertions.assertThrows(ArithmeticException.class, () -> cal.div(1, 0),"Divide by zero error");
	}
	
}
