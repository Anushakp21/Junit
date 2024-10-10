import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class CalciTest {

    Calci calci = new Calci();

    @ParameterizedTest
    @CsvSource({
        "2, 3, 6",    
        "0, 5, 0",    
        "-1, 5, -5",  
        "4, 0, 0",    
        "-2, -3, 6" 
    })
    void testMultiply(int a, int b, int expected) {
        assertEquals(expected, calci.multiply(a, b));
    }
}
