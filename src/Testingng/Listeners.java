package Testingng;

import org.testng.ITestListener;
import org.testng.ITestResult;

//activate after your before the test 
//Listeners listens to test cases
public class Listeners implements ITestListener {
	
	public  void onTestStart(ITestResult result) {
	    // not implemented
	  }

	
	public void onTestFailure(ITestResult result) {
	    // not implemented
	  }
	
	public void onTestSkipped(ITestResult result) {
	    // not implemented
	  }

}
