package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day2 {

	@Test
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
	
}
