import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

	private final EmailValidator emailValidator = new EmailValidator();

	@ParameterizedTest
	@ValueSource(strings = 
 		{
		"test@example.com",       
		"username@domain.co",   
		"invalid-email@",          
		"@missingusername.com",    
		"missingatsign.com",       
		""                         
})
	void testIsValidEmail(String email) 
	{
		boolean expected = !email.isEmpty() && 
				(email.contains("@") && email.contains(".")) &&
				email.indexOf("@") < email.indexOf(".");

		assertEquals(expected, emailValidator.isValidEmail(email));
	}
}
