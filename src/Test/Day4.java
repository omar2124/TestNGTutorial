package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day4 {

	@AfterClass
	public void BefoClas()
	{
		System.out.println("After executing all the methods in the class");
	}
	@Test(groups= {"Smoke"})
	public void WebTest()
	{
		System.out.println("Mozilla");
	}
	@Test
	public void MobileTest()
	{
		System.out.println("Chrome for android");
	}
	@Test
	public void APITest()
	{
		System.out.println("Postman tool");
	}
	@BeforeClass
	public void BefoClass()
	{
		System.out.println("Before executing any methods in the class");
	}
	
	
}
