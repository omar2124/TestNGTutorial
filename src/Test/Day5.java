package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day5 {

	@Test
	public void Welcome()
	{
		System.out.println("Hello");
	}
	@AfterTest
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
