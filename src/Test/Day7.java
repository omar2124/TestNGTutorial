package Test;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day7 {

	@Test(dataProvider="GetData")
	public void Data(String username, String password)
	{
		System.out.println("Getting data");
		System.out.println(username);
		System.out.println(password);
	}
	@DataProvider 
	public Object[][] GetData()
	{
		// 1st combination - username password - good credit history
		// 2nd username password - no credit history
		// 3rd fraudelent credit history
		Object[][] data = new Object[3][2];
		//1st set
		data[0][0]= "firstusername";
		data[0][1]= "password";
		//Columns in the row are nothing but values for that particular combination (row) 
		
		//2nd set
		data[1][0]= "seconduser";
		data[1][1]= "secondpassword";
		
		//3rd set
		data[2][0]= "thirdusername";
		data[2][1]= "thirdpassword";
		return data;
	}
	
	
}
