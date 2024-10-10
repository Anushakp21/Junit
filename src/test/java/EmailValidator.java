
public class EmailValidator
{
	public boolean isValidEmail(String email)
	{
		if (email == null || email.isEmpty()) 
		{
			return false; 
		}
		return email.contains("@") && email.contains(".");
	}
}
