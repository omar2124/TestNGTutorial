package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day6 {

	@Parameters({"URL","Username", "Password", "Key", "Message"})
	@Test
	public void LogInSite(String urlname, String user, String pass, String key, String message)
	{
		System.out.println(urlname);
		System.out.println(user);
		System.out.println(pass);
		System.out.println(key);
		System.out.println(message);
	}
	
	
}
