import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    private final PalindromeChecker palindromeChecker = new PalindromeChecker();

    @ParameterizedTest
    @CsvSource({
        "'madam', true",
        "'racecar', true",
        "'hello', false",
        "'A man a plan a canal Panama', true",
        "null, false"
    })
    void testIsPalindrome(String input, boolean expected)
    {
        assertEquals(expected, palindromeChecker.isPalindrome(input));
    }
}
