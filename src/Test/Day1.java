package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {

	@AfterTest
	public void LastExecution()
	{	
		System.out.println("I will execute last");
	}
	@Test
	public void Name()
	{
		System.out.println("Ignacio");
	}
	@Test
	public void LastName()
	{
		System.out.println("Chacon");
	}
	@Test
	public void Birthday()
	{
		System.out.println("September 12, 1987");
	}
	@Test
	public void Age()
	{
		System.out.println("31");
	}
	@AfterSuite
	public void AfSuite()
	{
		System.out.println("I am # 1 from last");
	}
	
}
