import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DemoTest {
	@BeforeAll
	static void beforeAll()
	{
		System.out.println("Before all methods"); 
	}
	@AfterAll
	static void afterAll() {
		System.out.println("After all methods");
	}
	@Test
	void addTest() {
		Demoo d = new Demoo();
		int expected = 4;
		assertEquals(expected, d.add(2, 2));
	}
	@AfterEach
	void afterEach()
	{
		System.out.println("after each method");
	}
	@BeforeEach
	 void beforeEach()
	{
		System.out.println("before each method");
	}
}
