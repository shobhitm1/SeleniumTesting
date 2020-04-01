package PRC;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class emp3 {

	 
	 @BeforeMethod
	 public void smsat() 
	 {
		 
		 System.out.println("Before Every MEthod");
	 }
	
	 @Test
	 public void smarty2() 
	 {
		 
		 System.out.println("The emp3 skipped test");
	 }
	 @Test(groups= {"Smoke"})
	 public void test3() 
	 {
		 System.out.println("The emp3 test");
	 }
	 
}