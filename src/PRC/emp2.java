package PRC;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class emp2 {

	 @Test(groups= {"Smoke"})
	 public void empw() 
	 {
		 
		 System.out.println("The emp2 test");
	 }
	 
	 @BeforeMethod
	 public void smsat() 
	 {
		 
		 System.out.println("Before Every MEthod");
	 }
	
	 
	 @AfterTest
	 public void ayste() 
	 {
		 
		 System.out.println("The after test");
	 }
	 
	 @Test
	 public void smarty2() 
	 {
		 
		 System.out.println("The emp2 skipped test");
	 }
	
}
