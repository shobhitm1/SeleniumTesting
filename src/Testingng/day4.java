package Testingng;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//rahulonlinetutor@gmail.com

public class day4 {

	//@Parameters({"URL"})
	@Test
	public void WebloginHomeLoan()
	{
		
		System.out.println("WebLoginHome TC of Day4 class");
		System.out.println("***************");
	//	System.out.println(URL);
	}
	
	
	
	@Test(groups={"Smoke"})
	public void MobileLoginHomeLoan()
	{
		//Appium
		System.out.println("MobileloginHome of Day4 CLass");
		System.out.println("***************");
	}
	
	@Test
	public void APIHomeLoan()
	{
		//Rest API automation
		System.out.println("APIloginHome of Day4 class");
		System.out.println("***************");
	}
}
