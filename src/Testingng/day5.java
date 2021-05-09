package Testingng;

import org.testng.annotations.BeforeSuite;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day5 {


		// TODO Auto-generated method stub
	@AfterTest
	public void lastexecution()
	{
		System.out.println("AfterTest :Day5 Class");
		
		
	}
	@AfterSuite
	public void afSyite()
	{
		System.out.println("After Suite : Day5 CLass");
		
	}

	@AfterClass
	public void aclass()
	{
		System.out.println("After class :  Day5 CLass");
		
	}
	@AfterMethod
	public void amethod()
	{
		System.out.println("After Method :  Day5 CLass");
		
	}

	@Test
	public void Demo()
	{
		System.out.println("Demo Class:Day5 Class");//automation
		
		
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("SecondDemo : Day5 Class");
		
	}
	

}
