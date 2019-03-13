package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class GlobalParameters {
	
	public WebDriver driver=null;
	@Test
	public void Login() throws IOException
	{
	Properties prope = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\Omar\\eclipse-workspace\\TestNGTutorial\\src\\Test\\datadriven.properties");
	prope.load(fis);
	System.out.println(prope.getProperty("username"));
	if (prope.getProperty("Browser").equals("Chrome"))
	{
		driver = new ChromeDriver();
	}
	else if (prope.getProperty("Browser").contains("Firefox"))
	{
		driver = new FirefoxDriver();
	}
	else
	{
		driver = new InternetExplorerDriver();
	}
	driver.get(prope.getProperty("URL"));
	
	
	
	
	}
	

}
