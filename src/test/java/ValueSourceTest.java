import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValueSourceTest {
	@ParameterizedTest
	@ValueSource(ints= {1,2,3,4})
	void testNum(int num)
	{
		ValueSourceExample vl=new ValueSourceExample();
		int expected=num*num;
		assertEquals(expected,vl.squareNumber(num) );
	}
	

}
