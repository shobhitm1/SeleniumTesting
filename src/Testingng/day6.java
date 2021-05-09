package Testingng;

import org.testng.annotations.BeforeSuite;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day6 {

	@BeforeMethod
	public void amethod()
	{
		System.out.println("Before Method :  Day6 CLass");
		
	}
	@AfterMethod
	public void amethod22()
	{
		System.out.println("After Method :  Day6 CLass");
		
	}

	@BeforeSuite
	public void bfSyite1()
	{
		System.out.println("Before Suite : Day6 Class");
		
	}
	@BeforeTest(alwaysRun = true)
	public void btestt()
	{
		System.out.println("BeforeTest :Day6 Class");
		
		
	}
	@BeforeClass
	public void bclass()
	{
		System.out.println("Before CLass : Day 6 Class");
		
	}
	
	@Test
	public void Demo1()
	{
		System.out.println("Demo1 Tc : Day6 Class");//automation
	
		
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("Second Demo : Day6 Class");
	
	}
	



}
