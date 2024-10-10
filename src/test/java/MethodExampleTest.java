import static org.junit.jupiter.api.Assertions.assertEquals; // Use JUnit 5 assertions
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MethodExampleTest {

    @ParameterizedTest
    @MethodSource("provideRadiusAndExpectedArea") 
    void testCalculateArea(double radius, double expectedArea) {
        MethodExample ml = new MethodExample();
        assertEquals(expectedArea, ml.calArea(radius), 0.0001);
    }

    // Provide test data method
    static Arguments[] provideRadiusAndExpectedArea() {
        return new Arguments[] {
            Arguments.of(0, 0),            
            Arguments.of(1, Math.PI),      
            Arguments.of(2, 4 * Math.PI), 
            Arguments.of(3, 9 * Math.PI),  
            Arguments.of(4, 16 * Math.PI) 
        };
    }
}
