package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestiveDropdownAssignment {

	public static void main(String[] args) throws InterruptedException {
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Shobhit\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement source=driver.findElement(By.id("autocomplete"));
				//autocomplete
		Thread.sleep(2000);
		source.sendKeys("IND");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script= "return document.getElementById(\"autocomplete\").value;";
		String text=(String) js.executeScript(script);
		//source.sendKeys(Keys.);
		int i=0;
		while(!text.equalsIgnoreCase("Indonesia")) {
			i++;
			source.sendKeys(Keys.ARROW_DOWN);
			text=(String) js.executeScript(script);
			System.out.println(text+" at-->"+i);
			if(i>5) {
				break;
			}
		}
		if(i>5) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element Found");
		}
	}

}
