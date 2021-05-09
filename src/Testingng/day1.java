package Testingng;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {


		// TODO Auto-generated method stub
	@AfterTest
	public void lastexecution()
	{
		System.out.println("******After Test Method Inside Day1 Class******");
		System.out.println("***************");
		
	}
	@Test
	public void Demo()
	{
		System.out.println("Demo TC of Day1 class");//automation
		System.out.println("***************");
		
	}
	@AfterSuite
	public void afSyite()
	{
		System.out.println("******AfterSuite Method Inside Day 1 Classs*****");
		System.out.println("***************");
	}
	@Test
	public void SecondTest()
	{
		System.out.println("Second Test of Day1 class");
		System.out.println("***************");
	}



}
