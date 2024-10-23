import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    private final EmailValidator emailValidator = new EmailValidator();

    @ParameterizedTest
    @ValueSource(strings = {
    	    "test@example.com",       
    	    "username@domain.co",   
    	    "user.name@sub.domain.com",    
    	    "user-name@domain.org",    
    	    "user+name@domain.co",     
    	    "user%name@domain.co",     
    	    "invalid-email@",         
    	    "@missingusername.com",    
    	    "missingatsign.com",       
    	    "user@.com",              
    	    "user@domaincom",          
    	    "user@domain.c",           
    	    "user@domain..com"                      
    	})

    void testIsValidEmail(String email) {
        boolean expected = (email != null && !email.isEmpty()) &&
                           email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");

        assertEquals(expected, emailValidator.isValidEmail(email));
    }
}
