import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator
{
	String email = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

	public boolean isValidEmail(String email) {
		if (email == null || email.isEmpty()) {
			return false; 
		}

		Pattern pattern = Pattern.compile(email);
		Matcher matcher = pattern.matcher(email);

		return matcher.matches();
	}
}
