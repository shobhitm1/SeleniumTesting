package Testingng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
//STCM
	@BeforeTest
	public void bTest()
	{
		System.out.println("BeforeTest inside Day2 Class");
		System.out.println("***************");
	}
	@Test(groups={"Smoke"})
	public void ploan()
	{
		System.out.println("Smoke Group based Test Case of Day2 Class");
		System.out.println("***************");
	}
	@Test
	public void plan()
	{
		System.out.println("Inside Day 2 Test Method plan");
		System.out.println("***************");
	}
	
	@Parameters({"URL"})
	@Test
	public void prerequiste(String pass)
	{
		System.out.println(pass);
		System.out.println("Parameterization example of Day2 Class");
		System.out.println("***************");
	}
}
 