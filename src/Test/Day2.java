package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day2 {

	
	@Test(timeOut=30000)
	public void Car()
	{
		System.out.println("Corolla");
	}
	@Test
	public void Model()
	{
		System.out.println("Toyota");
	}
	@Test
	public void Version()
	{
		System.out.println("XLE");
	}
	@Test
	public void Year()
	{
		System.out.println("2015");
	}
	@BeforeMethod
	public void BeforeEvery()
	{
		System.out.println("I will execute before every test method in day 2");
	}
	@AfterMethod
	public void AfterEvery()
	{
		System.out.println("I will execute After every test method in day 2");
	}
	
}
