package Testingng;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//rahulonlinetutor@gmail.com

public class day3 {
@BeforeClass
public void befoclas()
{
	System.out.println("before executing any methods in the class");
}
//@Parameters({ "URL","APIKey/usrname" })
	@Test
	public void WebloginCarLoan()
	{
		//selenium
		System.out.println("weblogincar");
		//System.out.println(urlname);
	//	System.out.println(key);
	}
	
	
	
	@AfterClass
	public void afteclas()
	{	
		System.out.println("After executing all methods in the class");
	}
		
	@Test
	public void MobileLogincarLoan()
	{
		//Appium
		System.out.println("Mobilelogincar");
	}
	@Test
	public void Bfsuite()
	{
		System.out.println(" I am no 1");
	}
	@Test(enabled=false)
	public void MobilesignimcarLoan()
	{
		//Appium
		System.out.println("Mobile SIGIN");
	}
	@Test
	public void MobilesignoutcarLoan()
	{
		//Appium
		System.out.println("Mobile SIGNOUT");
		//System.out.println(username);
	//	System.out.println(password);
		
	}
	
	@Test(dependsOnMethods={"MobilesignoutcarLoan"})
	public void APIcarLoan()
	{
		//Rest API automation
		System.out.println("APIlogincar");
	}
	
	
}
