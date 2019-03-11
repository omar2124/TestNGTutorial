package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {

	@Test
	public void WebPage()
	{
		System.out.println("Selenium");
	}
	@Test
	public void MobilePage()
	{
		System.out.println("Appium");
	}
	@Test
	public void MobileSignIn()
	{
		System.out.println("SignIn");
	}
	@Test
	public void MobileSignOff()
	{
		System.out.println("Signoff");
	}
	@Test
	public void MobileReports()
	{
		System.out.println("Reports");
	}
	@Test
	public void MobileVerification()
	{
		System.out.println("Verification");
	}
	@Test
	public void APIPage()
	{
		System.out.println("API");
	}
	@BeforeSuite
	public void BfSuite()
	{
		System.out.println("I am # 1");
	}
	
	
}
