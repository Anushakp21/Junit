import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CsvExampleTest {
	 @ParameterizedTest
	    @CsvSource({
	        "2, 3, 6",       
	        "5, 4, 20",  
	        "0, 10, 0",       
	        "3.5, 2.0, 7.0",  
	        "10, 5, 50"  
	    })
	    void testCalculateArea(double length, double width, double expectedArea) {
	        assertEquals(expectedArea, CsvExample.calculateArea(length, width), 0.0001);
	    }
}
