package seleniumsessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shobhit\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		String title =driver.getTitle();
		System.out.println("Title of the page is"+" "+title);	
	   driver.findElement(By.id("username")).sendKeys("shobhitm182@gmail.com");
	   driver.findElement(By.name("pw")).sendKeys("123456");
	  //  driver.findElement(By.cssSelector("#email")).sendKeys("shobhitm182@gmail.com");
	    System.out.println("Error message is  "+ driver.findElement(By.cssSelector("#error.loginError")).getText());
	//	driver.findElement(By.name("pass")).sendKeys("allgood");
	//	driver.findElement(By.linkText("Forgot account?")).click();
	//	driver.navigate().to("http://flipkart.com");
	//	driver.navigate().back();
	//	System.out.println(driver.getPageSource()); //get the pagesource of webpage.
		System.out.println(driver.getCurrentUrl()); //get the current URL webdriver is handling.
		//driver.close();//closes the current browser
		//driver.quit();//closes all the browser opened by webdriver instance
		//System.out.println("Browser is closed");
	}

}
	 