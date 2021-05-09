package Testingng;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//rahulonlinetutor@gmail.com

public class day3 {
@BeforeClass
public void befoclas()
{
	System.out.println("Before Class Tc of Day3 ");
	System.out.println("***************");
}
	@Parameters({"URL"})
	@Test
	public void WebloginCarLoan(String urlname)
	{
		//selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println("***************");
	//	System.out.println(key);
	}
	
	@BeforeMethod
	public void bmethod() {
		System.out.println("Before Method inside Day3 Class");
		System.out.println("***************");
	}
	
	@AfterClass
	public void afteclas()
	{	
		System.out.println("After Class Method of Day3 CLass");
		System.out.println("***************");
	}
		
	@Test
	public void MobileLogincarLoan()
	{
	
		System.out.println("Mobilelogincar Test Method of Day3 class");
		System.out.println("***************");
	}
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println(" Before the whole Suite of Day 3 Class");
		System.out.println("***************");
	}
	@Test(enabled=true)
	public void MobilesignimcarLoan()
	{
		//Appium
		System.out.println("MobilesignimcarLoan method of Day3 class");
		System.out.println("***************");
	}
	@Test(dataProvider="data-provider")
	public void MobilesignoutcarLoan(String URL,String URLL)
	{
		//Appium
		System.out.println("****************Mobile SIGNOUT parameterization of Day3 class***********");
		System.out.println(URL);
		System.out.println(URLL);
	//	System.out.println(password);
		System.out.println("***************");
		
	}
	
	@Test(dependsOnMethods={"MobilesignoutcarLoan"})
	public void APIcarLoan()
	{
		//Rest API automation
		System.out.println("APIlogincar");
	}
	
	@DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
		
        Object[][] data =new Object[3][2];
        data[0][0]="firstSetUsername";
        data[0][1]="pass";
        data[1][0]="third SetUsername";
        data[1][1]="2 pass";
        data[2][0]="fourth SetUsername";
        data[2][1]="4 pass";
        return data;
        		}
 
		
	
	
	
}
