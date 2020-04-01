package PRC;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class emp1 
	 {
		 private static final boolean False = false;

		@Test(groups= {"Smoke"})
		 public void smarty() 
		 {
			 
			 System.out.println("The emp1 test");
		 }
		 @Test(enabled=False)
		 public void anothersmart() 
		 {
			 
			 System.out.println("The emp1 another test");
		 }
		 @Test
		 public void smarty2() 
		 {
			 
			 System.out.println("The emp1 skipped test");
		 }
		 @BeforeTest
		 public void sma() 
		 {
			 
			 System.out.println("Before Test");
		 }
		 
		 @BeforeClass
		 public void bfreclass() 
		 {
			 
			 System.out.println("Before Classes");
		 }
		 @AfterClass
		 public void aftreclss() 
		 {
			 
			 System.out.println("After Classes");
		 }
		 @AfterMethod
		 public void aftmethod() 
		 {
			 
			 System.out.println("After Every MEthod");
		 }
		 @BeforeSuite
		 public void smat() 
		 {
			 
			 System.out.println("Before Suite Bitch");
		 }
		 
		 @AfterSuite
		 public void smafrt() 
		 {
			 
			 System.out.println("After Suite Bitch");
		 }
	}
		 

	


