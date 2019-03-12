package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day5 {

	@Test(groups= {"Smoke"})
	public void Welcome()
	{
		System.out.println("Hello");
	}
	@AfterTest(groups= {"Smoke"})
	public void Bye()
	{
		System.out.println("Good Bye");
	}
	@Test
	public void Message()
	{
		System.out.println("Have a nice day");
	}
	@BeforeTest
	public void PreRequisite()
	{
		System.out.println("I will execute first");
	}
	
}
